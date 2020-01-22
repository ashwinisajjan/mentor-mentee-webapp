package com.fairfield.chalktalk.service;

import java.util.List;

import com.fairfield.chalktalk.dto.StartUpApplicationDTO;
import com.fairfield.chalktalk.dto.StartUpApplicationResponseDTO;
import com.fairfield.chalktalk.entities.Mentee;
import com.fairfield.chalktalk.entities.StartUpApplication;

public interface IMenteeService {
	Long addStartupApplication(StartUpApplicationDTO requestDTO);
	
	List<StartUpApplicationResponseDTO> getAllStartUpApplicationsForReview();
	
    StartUpApplication getStartUpApplication(Long id);
	
	Boolean updateMentor(StartUpApplication application);
	
	Long addMentee(Mentee mentee);

}
