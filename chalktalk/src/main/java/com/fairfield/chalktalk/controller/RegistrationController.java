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

import com.fairfield.chalktalk.dto.UserRegistrationDTO;
import com.fairfield.chalktalk.exceptions.UsernameDoesnotExistException;
import com.fairfield.chalktalk.exceptions.UsernameExistsException;
import com.fairfield.chalktalk.service.IRegistrationService;
import com.fairfield.chalktalk.utility.ChacktalkUtil;

/**
 * @author Ashwini Sajjan
 *
 */
@RestController
public class RegistrationController {
	 
	@Autowired
	private IRegistrationService registrationService;
	    
	    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes="application/json", produces="application/json")
		public ResponseEntity<?> sendEmailToClient(@RequestBody UserRegistrationDTO userdto) {
	    	Boolean response = Boolean.FALSE;
	    	try {
	    		response = registrationService.register(userdto);
			} catch (UsernameExistsException e) {
				return new ResponseEntity<String>(e.getMessage(), ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.BAD_REQUEST);
			} catch (Exception e) {
				return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
	    	if(!response) {
	    		return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
	    	}
			//Returning successful response.
			return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
		}
	    
	    @RequestMapping(value = "/roles", method = RequestMethod.GET, produces="application/json")
		public ResponseEntity<List<String>> sendEmailToClient() {
	    	List<String> response = null;
	    	try {
	    		response = registrationService.getAllRoles();
			} catch (Exception e) {
				return new ResponseEntity<List<String>>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
			}

			//Returning successful response.
			return new ResponseEntity<List<String>>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
		}
	    
	    @RequestMapping(value = "/updatepassword", method = RequestMethod.POST, consumes="application/json",produces="application/json")
		public ResponseEntity<?> updatePassword(@RequestBody UserRegistrationDTO userdto) {
	    	Boolean response = Boolean.FALSE;
	    	try {
	    		response = registrationService.updatePassword(userdto);
			} catch (UsernameDoesnotExistException e) {
				return new ResponseEntity<String>(e.getMessage(), ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.BAD_REQUEST);
			} catch (Exception e) {
				return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
	    	if(!response) {
	    		return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(),HttpStatus.INTERNAL_SERVER_ERROR);
	    	}
			//Returning successful response.
			return new ResponseEntity<Boolean>(response, ChacktalkUtil.getHeadersForGetAPI(), HttpStatus.OK);
		}

		
}
