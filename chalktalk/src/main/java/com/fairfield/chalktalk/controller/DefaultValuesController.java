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

import com.fairfield.chalktalk.dto.CompanyStageDTO;
import com.fairfield.chalktalk.dto.CountyDTO;
import com.fairfield.chalktalk.dto.IndustryCategoryDTO;
import com.fairfield.chalktalk.dto.MentorSpecilizationDTO;
import com.fairfield.chalktalk.dto.StateDTO;
import com.fairfield.chalktalk.service.IDefaultValuesService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class DefaultValuesController {

	@Autowired
	public IDefaultValuesService defaultValuesService;
	
	@RequestMapping(value = "/getAllCounties", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CountyDTO>> getAllCounties() {
		List<CountyDTO> response = null;
		try {
			response = defaultValuesService.getAllCounties();
		} catch (Exception e) {
			return new ResponseEntity<List<CountyDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response == null) {
			return new ResponseEntity<List<CountyDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//Returning successful response.
		return new ResponseEntity<List<CountyDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getCompanyStages", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<CompanyStageDTO>> getCompanyStages() {
		List<CompanyStageDTO> response = null;
		try {
			response = defaultValuesService.getAllCompanyStages();
		} catch (Exception e) {
			return new ResponseEntity<List<CompanyStageDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response == null) {
			return new ResponseEntity<List<CompanyStageDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//Returning successful response.
		return new ResponseEntity<List<CompanyStageDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getMentorSpecilizations", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<MentorSpecilizationDTO>> getMentorSpecilizations() {
		List<MentorSpecilizationDTO> response = null;
		try {
			response = defaultValuesService.getAllMentorSpecilizations();
		} catch (Exception e) {
			return new ResponseEntity<List<MentorSpecilizationDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response == null) {
			return new ResponseEntity<List<MentorSpecilizationDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//Returning successful response.
		return new ResponseEntity<List<MentorSpecilizationDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getIndustryCategories", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<IndustryCategoryDTO>> getIndustryCategories() {
		List<IndustryCategoryDTO> response = null;
		try {
			response = defaultValuesService.getAllIndustryCategories();
		} catch (Exception e) {
			return new ResponseEntity<List<IndustryCategoryDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response == null) {
			return new ResponseEntity<List<IndustryCategoryDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//Returning successful response.
		return new ResponseEntity<List<IndustryCategoryDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getAllStates", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<StateDTO>> getAllStates() {
		List<StateDTO> response = null;
		try {
			response = defaultValuesService.getAllStates();
		} catch (Exception e) {
			return new ResponseEntity<List<StateDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(response == null) {
			return new ResponseEntity<List<StateDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//Returning successful response.
		return new ResponseEntity<List<StateDTO>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
	}

	/**
	 * @param defaultValuesService the defaultValuesService to set
	 */
	public void setDefaultValuesService(IDefaultValuesService defaultValuesService) {
		this.defaultValuesService = defaultValuesService;
	}
}
