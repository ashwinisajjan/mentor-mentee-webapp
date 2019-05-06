/**
 * 
 */
package com.fairfield.chalktalk.service;

import java.util.List;

import com.fairfield.chalktalk.dto.CompanyStageDTO;
import com.fairfield.chalktalk.dto.CountyDTO;
import com.fairfield.chalktalk.dto.IndustryCategoryDTO;
import com.fairfield.chalktalk.dto.MentorSpecilizationDTO;
import com.fairfield.chalktalk.dto.StateDTO;

/**
 * @author Ashwini Sajjan
 *
 */
public interface IDefaultValuesService {

	List<StateDTO> getAllStates();
	List<CountyDTO> getAllCounties();
	List<MentorSpecilizationDTO> getAllMentorSpecilizations();
	List<IndustryCategoryDTO> getAllIndustryCategories();
	List<CompanyStageDTO> getAllCompanyStages();
}
