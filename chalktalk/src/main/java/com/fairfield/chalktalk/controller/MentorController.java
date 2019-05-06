/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fairfield.chalktalk.dto.MentorDTO;
import com.fairfield.chalktalk.dto.MentorProfileResponseDTO;
import com.fairfield.chalktalk.service.IFileOperations;
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
	
	@Autowired
	private IFileOperations fileOperationService;
	
	@RequestMapping(value = "/getAllMentorProfiles", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MentorProfileResponseDTO>> getMentorProfiles() {
		List<MentorProfileResponseDTO> response = null;
		try {
			response = mentorService.getAllMentors();
		} catch (Exception e) {
			return new ResponseEntity<List<MentorProfileResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<List<MentorProfileResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<List<MentorProfileResponseDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/applyToBeMentor", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<Long> applyForMentorShip(@RequestBody MentorDTO requestMentorDTO) {
		Long response = null;
		try {
			response = mentorService.addMentor(requestMentorDTO);
		} catch (Exception e) {
			return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/uploadFiles", method = RequestMethod.POST, consumes = {"multipart/mixed", "multipart/form-data"}, produces = {"application/json"})
	public ResponseEntity<Boolean> applyForMentorShip(@RequestParam("mentorId") Long id,
			@RequestParam(value ="resume", required=false) MultipartFile resume, @RequestParam(name="certificate", required=false) MultipartFile certificate,
			@RequestParam(value ="profilePic", required=false) MultipartFile profilePic) {
		Boolean response = false;
		try {
			Map<String,MultipartFile> uploadedFileswithTypes = new HashMap<String,MultipartFile>();
			if(resume!= null) {
				uploadedFileswithTypes.put("resume", resume);
			}
			if(certificate!= null) {
				uploadedFileswithTypes.put("certificate", certificate);
			}
			if(profilePic!=null ) {
				uploadedFileswithTypes.put("profilePic", profilePic);
			}
			response = fileOperationService.saveFileToDisk(id, uploadedFileswithTypes);
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

	/**
	 * @param fileOperationService the fileOperationService to set
	 */
	public void setFileOperationService(IFileOperations fileOperationService) {
		this.fileOperationService = fileOperationService;
	}
}
