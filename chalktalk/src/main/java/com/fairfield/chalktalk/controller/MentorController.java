/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fairfield.chalktalk.dto.MentorDTO;
import com.fairfield.chalktalk.service.IMentorService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class MentorController {

	@Autowired
	private IMentorService mentorService;
	
	@RequestMapping(value = "/getAllMentorProfiles", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MentorDTO>> getMentorProfiles() {
		List<MentorDTO> response = null;
		try {
			response = mentorService.getAllMentors();
		} catch (Exception e) {
			return new ResponseEntity<List<MentorDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<List<MentorDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<List<MentorDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/applyToBeMentor", method = RequestMethod.POST, consumes = "application/json", produces = {"application/json"})
	public ResponseEntity<Boolean> applyForMentorShip(@RequestBody MentorDTO requestMentorDTO) {
		Boolean response = false;
		try {
			response = mentorService.addMentor(requestMentorDTO);
		} catch (Exception e) {
			return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(!response) {
			return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	

	/**
	 * @param mentorService the mentorService to set
	 */
	public void setMentorService(IMentorService mentorService) {
		this.mentorService = mentorService;
	}
}
