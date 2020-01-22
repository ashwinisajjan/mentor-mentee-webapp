/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fairfield.chalktalk.dao.ICompanyStageDao;
import com.fairfield.chalktalk.dao.ICountyDao;
import com.fairfield.chalktalk.dao.IIndustryCategoryDao;
import com.fairfield.chalktalk.dao.IMentorSpecializationDao;
import com.fairfield.chalktalk.dao.IStateDao;
import com.fairfield.chalktalk.dto.CompanyStageDTO;
import com.fairfield.chalktalk.dto.CountyDTO;
import com.fairfield.chalktalk.dto.IndustryCategoryDTO;
import com.fairfield.chalktalk.dto.MentorSpecilizationDTO;
import com.fairfield.chalktalk.dto.StateDTO;
import com.fairfield.chalktalk.entities.CompanyStage;
import com.fairfield.chalktalk.entities.County;
import com.fairfield.chalktalk.entities.IndustryCategory;
import com.fairfield.chalktalk.entities.MentorSpecialization;
import com.fairfield.chalktalk.entities.State;
import com.fairfield.chalktalk.service.IDefaultValuesService;

/**
 * @author Ashwini Sajjan
 *
 */
public class DefaultValuesServiceImpl implements IDefaultValuesService{

	@Autowired
	private ICountyDao countyDao;
	@Autowired
	private IIndustryCategoryDao industryCategoryDao;
	@Autowired
	private ICompanyStageDao companyStageDao;
	@Autowired
	private IStateDao stateDao;
	@Autowired
	private IMentorSpecializationDao mentorSpecializationDao;
	
	@Override
	public List<StateDTO> getAllStates() {
		List<StateDTO> allStatesDTO = null;
		try {
			allStatesDTO = new ArrayList<>();
			List<State> allStates = stateDao.findAll();
			for (State state : allStates) {
				StateDTO stateDTO = new StateDTO(state.getStateId(), state.getState());
				allStatesDTO.add(stateDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return allStatesDTO;
	}

	@Override
	public List<CountyDTO> getAllCounties() {
		List<CountyDTO> allCountiesDTO = null;
		try {
			allCountiesDTO = new ArrayList<>();
			List<County> allCounties = countyDao.findAll();
			for (County county : allCounties) {
				CountyDTO countyDTO = new CountyDTO(county.getCountyId(), county.getCounty(), county.getState());
				allCountiesDTO.add(countyDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return allCountiesDTO;
	}

	@Override
	public List<MentorSpecilizationDTO> getAllMentorSpecilizations() {

		List<MentorSpecilizationDTO> mentorSpecializationsDTO = null;
		try {
			mentorSpecializationsDTO = new ArrayList<>();
			List<MentorSpecialization> mentorSpecializations = mentorSpecializationDao.findAll();
			for (MentorSpecialization mentorSpecialization : mentorSpecializations) {
				MentorSpecilizationDTO mentorSpecilizationDTO = new MentorSpecilizationDTO(mentorSpecialization.getId(), 
						mentorSpecialization.getaPSIndustry(), mentorSpecialization.getSpecialization(), mentorSpecialization.getOrder());
				mentorSpecializationsDTO.add(mentorSpecilizationDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return mentorSpecializationsDTO;
	}

	@Override
	public List<IndustryCategoryDTO> getAllIndustryCategories() {
		List<IndustryCategoryDTO> industryCategoriesDTO = null;
		try {
			industryCategoriesDTO = new ArrayList<>();
			List<IndustryCategory> industryCategories = industryCategoryDao.findAll();
			for (IndustryCategory industryCategory : industryCategories) {
				IndustryCategoryDTO industryCategoryDTO = 
						new IndustryCategoryDTO(industryCategory.getId(), industryCategory.getIndustryCategory(), industryCategory.getOrder());
				industryCategoriesDTO.add(industryCategoryDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return industryCategoriesDTO;
	}

	@Override
	public List<CompanyStageDTO> getAllCompanyStages() {
		List<CompanyStageDTO> companyStageDTOs = null;
		try {
			companyStageDTOs = new ArrayList<>();
			List<CompanyStage> companyStages = companyStageDao.findAll();
			for (CompanyStage companyStage : companyStages) {
				CompanyStageDTO companyStageDTO = 
						new CompanyStageDTO(companyStage.getCompanyStageId(), companyStage.getStage(), companyStage.getOrder());
				companyStageDTOs.add(companyStageDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return companyStageDTOs;
	}
	
	/*@Override
	public List<AddressDTO> getAllMeetupLocations() {
		List<AddressDTO> addressDto = null;
		try {
			addressDto = new ArrayList<>();
			List<Address> addressEntities = companyStageDao.findAll();
			for (CompanyStage companyStage : companyStages) {
				CompanyStageDTO companyStageDTO = 
						new CompanyStageDTO(companyStage.getCompanyStageId(), companyStage.getStage(), companyStage.getOrder());
				addressDto.add(companyStageDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return companyStageDTOs;
	}*/
	
	/**
	 * @param countyDao the countyDao to set
	 */
	public void setCountyDao(ICountyDao countyDao) {
		this.countyDao = countyDao;
	}

	/**
	 * @param industryCategoryDao the industryCategoryDao to set
	 */
	public void setIndustryCategoryDao(IIndustryCategoryDao industryCategoryDao) {
		this.industryCategoryDao = industryCategoryDao;
	}

	/**
	 * @param companyStageDao the companyStageDao to set
	 */
	public void setCompanyStageDao(ICompanyStageDao companyStageDao) {
		this.companyStageDao = companyStageDao;
	}

	/**
	 * @param stateDao the stateDao to set
	 */
	public void setStateDao(IStateDao stateDao) {
		this.stateDao = stateDao;
	}

	/**
	 * @param mentorSpecializationDao the mentorSpecializationDao to set
	 */
	public void setMentorSpecializationDao(IMentorSpecializationDao mentorSpecializationDao) {
		this.mentorSpecializationDao = mentorSpecializationDao;
	}
}
