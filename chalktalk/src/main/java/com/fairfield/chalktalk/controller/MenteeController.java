/**
 * 
 */
package com.fairfield.chalktalk.controller;

import java.util.HashMap;
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

import com.fairfield.chalktalk.dto.StartUpApplicationDTO;
import com.fairfield.chalktalk.service.IFileOperations;
import com.fairfield.chalktalk.service.IMenteeService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class MenteeController {

	@Autowired
	private IMenteeService menteeService;
	
	@Autowired
	private IFileOperations fileOperationService;
	
	@RequestMapping(value = "/savestartupapplication", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<Long> applyForMentorShip(@RequestBody StartUpApplicationDTO requestDTO) {
		Long response = null;
		try {
			response = menteeService.addStartupApplication(requestDTO);
		} catch (Exception e) {
			return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if(response == null) {
			return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

		//Returning successful response.
		return new ResponseEntity<Long>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/savestartupapplication/uploadFiles", method = RequestMethod.POST, consumes = {"multipart/mixed", "multipart/form-data"}, produces = {"application/json"})
	public ResponseEntity<Boolean> applyForMentorShip(@RequestParam("startupapplicationid") Long id,
			@RequestParam(value ="businessplandoc", required=false) MultipartFile businessplandoc, @RequestParam(name="otherDocs", required=false) MultipartFile otherDocs,
			@RequestParam(value ="pitchDeck", required=false) MultipartFile pitchDeck) {
		Boolean response = false;
		try {
			Map<String,MultipartFile> uploadedFileswithTypes = new HashMap<String,MultipartFile>();
			if(businessplandoc!= null) {
				uploadedFileswithTypes.put("businessplandoc", businessplandoc);
			}
			if(pitchDeck!= null) {
				uploadedFileswithTypes.put("pitchDeck", pitchDeck);
			}
			if(otherDocs!=null ) {
				uploadedFileswithTypes.put("otherDocs", otherDocs);
			}
			response = fileOperationService.saveStartupDocsToDisk(id, uploadedFileswithTypes);
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
	 * @param menteeService the menteeService to set
	 */
	public void setMenteeService(IMenteeService menteeService) {
		this.menteeService = menteeService;
	}

	/**
	 * @param fileOperationService the fileOperationService to set
	 */
	public void setFileOperationService(IFileOperations fileOperationService) {
		this.fileOperationService = fileOperationService;
	}
}
