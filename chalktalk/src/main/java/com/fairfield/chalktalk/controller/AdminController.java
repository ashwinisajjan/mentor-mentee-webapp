/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fairfield.chalktalk.dto.MentorResponseDTO;
import com.fairfield.chalktalk.dto.StartUpApplicationResponseDTO;
import com.fairfield.chalktalk.service.IMenteeService;
import com.fairfield.chalktalk.service.IMentorService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;


/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class AdminController {
	
	@Autowired
	private IMentorService mentorService;
	
	@Autowired
	private IMenteeService menteeService;
	
	@RequestMapping(value = "/admin/getAllMentorApplications", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MentorResponseDTO>> getMentorProfiles() {
		List<MentorResponseDTO> response = null;
		try {
			response = mentorService.getAllMentorApplications();
		} catch (Exception e) {
			return new ResponseEntity<List<MentorResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<List<MentorResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<List<MentorResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/admin/getAllStartupApplications", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<StartUpApplicationResponseDTO>> getAllStartupApplications() {
		List<StartUpApplicationResponseDTO> response = null;
		try {
			response = menteeService.getAllStartUpApplicationsForReview();
		} catch (Exception e) {
			return new ResponseEntity<List<StartUpApplicationResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<List<StartUpApplicationResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<List<StartUpApplicationResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}

	/**
	 * @param mentorService the mentorService to set
	 */
	public void setMentorService(IMentorService mentorService) {
		this.mentorService = mentorService;
	}

	/**
	 * @param menteeService the menteeService to set
	 */
	public void setMenteeService(IMenteeService menteeService) {
		this.menteeService = menteeService;
	}
}
