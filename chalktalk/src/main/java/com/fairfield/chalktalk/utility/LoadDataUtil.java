/**
 * 
 */
package com.fairfield.chalktalk.utility;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fairfield.chalktalk.daoImpl.CompanyStageDaoImpl;
import com.fairfield.chalktalk.daoImpl.CountyDaoImpl;
import com.fairfield.chalktalk.daoImpl.IndustryCategoryDaoImpl;
import com.fairfield.chalktalk.daoImpl.MentorSpecializationDaoImpl;
import com.fairfield.chalktalk.daoImpl.StateDaoImpl;
import com.fairfield.chalktalk.entities.CompanyStage;
import com.fairfield.chalktalk.entities.County;
import com.fairfield.chalktalk.entities.IndustryCategory;
import com.fairfield.chalktalk.entities.MentorSpecialization;
import com.fairfield.chalktalk.entities.State;

/**
 * @author Ashwini Sajjan
 *
 */
@Component
public class LoadDataUtil {

	@Autowired
	private IndustryCategoryDaoImpl industryCategoryDaoImpl;
	@Autowired
	private MentorSpecializationDaoImpl mentorSpecializationDaoImpl;
	@Autowired
	private StateDaoImpl stateDaoImpl;
	@Autowired
	private CountyDaoImpl countyDaoImpl;
	@Autowired
	private CompanyStageDaoImpl companyStageDaoImpl;
	private String fileName;
	
	public void readExcelSheetData() {
		FileInputStream fis;
		XSSFRow row;
		List<XSSFSheet> sheetsList = null;
		try {
			 System.out.println("-------------------------------READING THE SPREADSHEET-------------------------------------");
	            fis = new FileInputStream(fileName);
	            XSSFWorkbook dataInexcel = new XSSFWorkbook(fis);
	            sheetsList = new ArrayList<XSSFSheet>();
	            XSSFSheet industrySpecializationDataSheet = dataInexcel.getSheetAt(0);
	            XSSFSheet mentorSpecializationDataSheet = dataInexcel.getSheetAt(1);
	            XSSFSheet companyStageDataSheet = dataInexcel.getSheetAt(2);
	            XSSFSheet statesDataSheet = dataInexcel.getSheetAt(3);
	            XSSFSheet countiesDataSheet = dataInexcel.getSheetAt(4);
	            
	            sheetsList.add(industrySpecializationDataSheet);
	            sheetsList.add(mentorSpecializationDataSheet);
	            sheetsList.add(companyStageDataSheet);
	            sheetsList.add(statesDataSheet);
	            sheetsList.add(countiesDataSheet);
	            
	            for(XSSFSheet currentSheet : sheetsList) {
	            	Iterator< Row> rowIterator = currentSheet.iterator();
	            	rowIterator.next();
		            if(currentSheet.getSheetName().equals("INDUSTRY SPECIALIZATION")) {
		            	while(rowIterator.hasNext()) {
		            		row = (XSSFRow) rowIterator.next();
			            	IndustryCategory entity = new IndustryCategory(row.getCell(0).getStringCellValue(), (int)row.getCell(1).getNumericCellValue());
			            	insertRowInDB(entity);
			            }
		            } else if (currentSheet.getSheetName().equals("MENTOR SPECIALIZATION")) {
		            	while(rowIterator.hasNext()) {
			            	row = (XSSFRow) rowIterator.next();
			            	MentorSpecialization entity = new MentorSpecialization(row.getCell(0).getStringCellValue(),row.getCell(1).getStringCellValue(), (int)row.getCell(2).getNumericCellValue());
			            	insertRowInDB(entity);
			            }
		            } else if (currentSheet.getSheetName().equals("COMPANY_STAGE")) {
		            	while(rowIterator.hasNext()) {
			            	row = (XSSFRow) rowIterator.next();
			            	CompanyStage entity = new CompanyStage(row.getCell(0).getStringCellValue(), (int)row.getCell(1).getNumericCellValue());
			            	insertRowInDB(entity);
			            }
		            } else if (currentSheet.getSheetName().equals("STATES")) {
		            	while(rowIterator.hasNext()) {
			            	row = (XSSFRow) rowIterator.next();
			            	State entity = new State(row.getCell(0).getStringCellValue());
			            	insertRowInDB(entity);
			            }
		            } else if (currentSheet.getSheetName().equals("COUNTIES")) {
		            	while(rowIterator.hasNext()) {
			            	row = (XSSFRow) rowIterator.next();
			            	County entity = new County(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue());
			            	insertRowInDB(entity);
			            }
		            }
	            
	            }
	            System.out.println("-------------------------------COMPLETED READING THE SPREADSHEET-------------------------------------");       
	           
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void insertRowInDB(Serializable entity) {
		try {
			if(entity instanceof IndustryCategory) {
				industryCategoryDaoImpl.create((IndustryCategory)entity);
			} else if (entity instanceof MentorSpecialization) {
				mentorSpecializationDaoImpl.create((MentorSpecialization)entity);
			} else if (entity instanceof State) {
				stateDaoImpl.create((State)entity);
			} else if (entity instanceof County) {
				countyDaoImpl.create((County)entity);
			} else if (entity instanceof CompanyStage) {
				companyStageDaoImpl.create((CompanyStage)entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param industryCategoryDaoImpl the industryCategoryDaoImpl to set
	 */
	public void setIndustryCategoryDaoImpl(IndustryCategoryDaoImpl industryCategoryDaoImpl) {
		this.industryCategoryDaoImpl = industryCategoryDaoImpl;
	}
	/**
	 * @param mentorSpecializationDaoImpl the mentorSpecializationDaoImpl to set
	 */
	public void setMentorSpecializationDaoImpl(MentorSpecializationDaoImpl mentorSpecializationDaoImpl) {
		this.mentorSpecializationDaoImpl = mentorSpecializationDaoImpl;
	}
	/**
	 * @param stateDaoImpl the stateDaoImpl to set
	 */
	public void setStateDaoImpl(StateDaoImpl stateDaoImpl) {
		this.stateDaoImpl = stateDaoImpl;
	}
	/**
	 * @param countyDaoImpl the countyDaoImpl to set
	 */
	public void setCountyDaoImpl(CountyDaoImpl countyDaoImpl) {
		this.countyDaoImpl = countyDaoImpl;
	}
	/**
	 * @param companyStageDaoImpl the companyStageDaoImpl to set
	 */
	public void setCompanyStageDaoImpl(CompanyStageDaoImpl companyStageDaoImpl) {
		this.companyStageDaoImpl = companyStageDaoImpl;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
