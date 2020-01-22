/**
 * 
 */
package com.fairfield.chalktalk.service;

import java.util.List;

import com.fairfield.chalktalk.dto.MentorDTO;
import com.fairfield.chalktalk.dto.MentorProfileResponseDTO;
import com.fairfield.chalktalk.dto.MentorResponseDTO;
import com.fairfield.chalktalk.dto.SearchRequestDTO;
import com.fairfield.chalktalk.entities.Mentor;

/**
 * @author Ashwini Sajjan
 *
 */
public interface IMentorService {
	
	List<MentorProfileResponseDTO> getAllMentors();
	
	Long addMentor(MentorDTO mentor);
	
	Mentor getMentor(Long id);
	
	List<MentorResponseDTO> getAllMentorApplications();

	Boolean updateMentor(Mentor mentor);

	List<MentorProfileResponseDTO> getMentorSearchResults(SearchRequestDTO requestdto);

}
