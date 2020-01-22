/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fairfield.chalktalk.dao.IMenteeDao;
import com.fairfield.chalktalk.dao.IStartUpApplicationDao;
import com.fairfield.chalktalk.dto.StartUpApplicationDTO;
import com.fairfield.chalktalk.dto.StartUpApplicationResponseDTO;
import com.fairfield.chalktalk.entities.FileUpload;
import com.fairfield.chalktalk.entities.Mentee;
import com.fairfield.chalktalk.entities.StartUpApplication;
import com.fairfield.chalktalk.service.IMenteeService;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * @author Ashwini Sajjan
 *
 */
public class MenteeServiceImpl implements IMenteeService{

	@Autowired
	private IStartUpApplicationDao startUpApplicationDao;
	
	@Autowired
	private IMenteeDao menteeDao;
	
	@Override
	public Long addStartupApplication(StartUpApplicationDTO requestDTO) {
		StartUpApplication startupApplication = null;
		try {
			startupApplication = new StartUpApplication();
			startupApplication.setAmountOfWorkPut(requestDTO.getAmountOfWorkPut());
			startupApplication.setApplicantEmailId(requestDTO.getApplicantEmailId());
			startupApplication.setApplicantJobRole(requestDTO.getApplicantJobRole());
			startupApplication.setApplicantName(requestDTO.getApplicantName());
			startupApplication.setApplicantPhoneNo(requestDTO.getApplicantPhoneNo());
			startupApplication.setCompanyStage(requestDTO.getCompanyStage());
			startupApplication.setCompanyStartDate(requestDTO.getCompanyStartDate());
			startupApplication.setCurrentCompetitors(requestDTO.getCompetitors());
			startupApplication.setLinkedInProfile(requestDTO.getLinkedInProfile());
			startupApplication.setMentoringsession(requestDTO.isHadMentoringSession());
			startupApplication.setPrimaryGoal(requestDTO.getPrimaryGoal());
			startupApplication.setPriorExperience(requestDTO.isHadPriorExperience());
			startupApplication.setReferredBy(requestDTO.getReferredBy());
			startupApplication.setStartUpDesc(requestDTO.getStartUpDesc());
			startupApplication.setStartUpName(requestDTO.getStartUpName());
			startupApplication.setTargetCustomers(requestDTO.getCustomers());
			startupApplication.setTeamDetails(requestDTO.getTeamDetails());
			startupApplication.setWebsite(requestDTO.getWebsite());
			startupApplication.setCity(requestDTO.getCity());
			
			startUpApplicationDao.create(startupApplication);
			
		} catch (Exception e) {
			return null;
		}
		return startupApplication.getApplicationId();
	}

	
	/**
	 * @param startUpApplicationDao the startUpApplicationDao to set
	 */
	public void setStartUpApplicationDao(IStartUpApplicationDao startUpApplicationDao) {
		this.startUpApplicationDao = startUpApplicationDao;
	}


	@Override
	public List<StartUpApplicationResponseDTO> getAllStartUpApplicationsForReview() {
		List<StartUpApplicationResponseDTO> applications = null;
		try {
			applications = new ArrayList<StartUpApplicationResponseDTO>();
			List<StartUpApplication> applicationEntities = startUpApplicationDao.findAll();
			for (StartUpApplication entity : applicationEntities) {
				if(!entity.isApplicationAccepted()) {
					StartUpApplicationResponseDTO responseDto = new StartUpApplicationResponseDTO();
					responseDto.setApplicationId(entity.getApplicationId());
					responseDto.setStartUpName(entity.getStartUpName());
					responseDto.setDeatilsDoc(convertToPdfFile(entity));
					for (FileUpload UploadedFile : entity.getFileUploads()) {
						if (UploadedFile.getWhatIsIt().equalsIgnoreCase("BUSINESSPLANDOC")) {
							responseDto.setBusinessdoc(UploadedFile.getFilePath());
						}else if (UploadedFile.getWhatIsIt().equalsIgnoreCase("PITCHDECKDOC")) {
							responseDto.setPitchdeck(UploadedFile.getFilePath());
						}else if (UploadedFile.getWhatIsIt().equalsIgnoreCase("OTHERDOC")) {
							responseDto.setOtherdoc(UploadedFile.getFilePath());
						}
					}
					applications.add(responseDto);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return applications;
		}
		return applications;
	}


	private String convertToPdfFile(StartUpApplication entity) {
		Document document = new Document();
		String imageURL = null;
		try {
			File startupsDir = new File("../webapps/reviewstartups");
			if(!startupsDir.exists()){
				startupsDir.mkdir();
			}
			String fileName = entity.getStartUpName()+".pdf";
			imageURL = "../webapps/reviewstartups/"+fileName;
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(startupsDir.getCanonicalPath()+"/"+fileName));
			 document.open();
	         document.add((new Paragraph("Startup Application")));
	         document.add(new Paragraph("Amount Of Work Put :".toUpperCase()+entity.getAmountOfWorkPut()));
	         document.add(new Paragraph("Applicant EmailId :".toUpperCase()+entity.getApplicantEmailId()));
	         document.add(new Paragraph("Applicant Job Role :".toUpperCase()+entity.getApplicantJobRole()));
	         document.add(new Paragraph("Applicant Name :".toUpperCase()+entity.getApplicantName()));
	         document.add(new Paragraph("Applicant Phone No :".toUpperCase()+entity.getApplicantPhoneNo()));
	         document.add(new Paragraph("StartUp City :".toUpperCase()+entity.getCity()));
	         document.add(new Paragraph("Comapny Stage :".toUpperCase()+entity.getCompanyStage()));
	         document.add(new Paragraph("Company StartDate :".toUpperCase()+entity.getCompanyStartDate()));
	         document.add(new Paragraph("Current Competitors :".toUpperCase()+entity.getCurrentCompetitors()));
	         document.add(new Paragraph("Customer Problem :".toUpperCase()+entity.getCustomerProblem()));
	         document.add(new Paragraph("LinkedInProfile :".toUpperCase()+entity.getLinkedInProfile()));
	         document.add(new Paragraph("PrimaryGoal :".toUpperCase()+entity.getPrimaryGoal()));
	         document.add(new Paragraph("ReferredBy :".toUpperCase()+entity.getReferredBy()));
	         document.add(new Paragraph("StartUpDesc :".toUpperCase()+entity.getStartUpDesc()));
	         document.add(new Paragraph("StartUpName :".toUpperCase()+entity.getStartUpName()));
	         document.add(new Paragraph("TeamDetails :".toUpperCase()+entity.getTeamDetails()));
	         document.add(new Paragraph("TargetCustomers :".toUpperCase()+entity.getTargetCustomers()));
	         document.add(new Paragraph("Website :".toUpperCase()+entity.getWebsite()));
	         
	         document.close();
	         writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imageURL;
	}


	@Override
	public StartUpApplication getStartUpApplication(Long id) {
		StartUpApplication application = null;
		try {
			application = startUpApplicationDao.findOne(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return application;
	}


	@Override
	public Boolean updateMentor(StartUpApplication application) {
		try {
			application = startUpApplicationDao.update(application);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


	@Override
	public Long addMentee(Mentee mentee) {
		try {
			menteeDao.create(mentee);
		} catch (Exception e) {
			return null;
		}
		return mentee.getMenteeId();
	}


	/**
	 * @param menteeDao the menteeDao to set
	 */
	public void setMenteeDao(IMenteeDao menteeDao) {
		this.menteeDao = menteeDao;
	}
	
}
