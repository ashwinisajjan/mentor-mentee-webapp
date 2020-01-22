/**
 * 
 */
package com.fairfield.chalktalk.service;

import java.util.List;

import com.fairfield.chalktalk.dto.UserRegistrationDTO;
import com.fairfield.chalktalk.entities.Role;
import com.fairfield.chalktalk.exceptions.UsernameDoesnotExistException;
import com.fairfield.chalktalk.exceptions.UsernameExistsException;

/**
 * @author Ashwini Sajjan
 *
 */
public interface IRegistrationService {
	
	Boolean register(UserRegistrationDTO userdto) throws UsernameExistsException;
	
	List<String> getAllRoles();
	
	Boolean updatePassword(UserRegistrationDTO userdto) throws UsernameDoesnotExistException;

}
