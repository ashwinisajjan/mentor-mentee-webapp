/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.fairfield.chalktalk.dao.IStartUpApplicationDao;
import com.fairfield.chalktalk.dto.StartUpApplicationDTO;
import com.fairfield.chalktalk.entities.StartUpApplication;
import com.fairfield.chalktalk.service.IMenteeService;

/**
 * @author Ashwini Sajjan
 *
 */
public class MenteeServiceImpl implements IMenteeService{

	@Autowired
	private IStartUpApplicationDao startUpApplicationDao;
	
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
}
