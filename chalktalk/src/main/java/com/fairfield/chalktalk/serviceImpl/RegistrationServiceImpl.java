/**
 * 
 */
package com.fairfield.chalktalk.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.fairfield.chalktalk.dao.IRoleDao;
import com.fairfield.chalktalk.dao.IUserDao;
import com.fairfield.chalktalk.dto.UserRegistrationDTO;
import com.fairfield.chalktalk.entities.Role;
import com.fairfield.chalktalk.entities.User;
import com.fairfield.chalktalk.exceptions.UsernameDoesnotExistException;
import com.fairfield.chalktalk.exceptions.UsernameExistsException;
import com.fairfield.chalktalk.service.IRegistrationService;

/**
 * @author Ashwini Sajjan
 *
 */
public class RegistrationServiceImpl implements IRegistrationService{

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private IRoleDao roleDao;
	
	@Override
	public Boolean register(UserRegistrationDTO userdto) throws UsernameExistsException{
		try {
			List<User> usersList = userDao.findAll();
			for(User userEntity : usersList) {
				if(userEntity.getUserName().equalsIgnoreCase(userdto.getUserName())) {
					throw new UsernameExistsException("Given username already exists!!Please try another username");
				}
			}
			User userEntity = new User();
			userEntity.setActive(Boolean.TRUE);
			userEntity.setUserName(userdto.getUserName());
			userEntity.setPassword(userdto.getPassword());
			List<Role> roles = roleDao.findAll();
			Set<Role> previlages = new HashSet<Role>();
			for(Role roleEntity : roles) {
				if(roleEntity.getRole().equalsIgnoreCase(userdto.getRole())) {
					previlages.add(roleEntity);
				}
			}
			userEntity.setRoles(previlages);
			userDao.create(userEntity);
		}catch (UsernameExistsException e) {
			throw new UsernameExistsException("Given username already exists!!Please try another username");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public List<String> getAllRoles() {
		List<String> roles = new ArrayList<String>();
		try {
			List<Role> rolesEntities = roleDao.findAll();
			for(Role entity : rolesEntities) {
				roles.add(entity.getRole());
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return roles;
	}
	
	@Override
	public Boolean updatePassword(UserRegistrationDTO userdto) throws UsernameDoesnotExistException {

		try {
			List<User> usersList = userDao.findAll();
			boolean userExists = false;
			for(User userEntity : usersList) {
				if(userEntity.getUserName().equalsIgnoreCase(userdto.getUserName())) {
					userEntity.setPassword(userdto.getPassword());
					userDao.update(userEntity);
					userExists = true;
				}
			}
			if(!userExists) {
				throw new UsernameDoesnotExistException("Username is invalid");
			}
		}catch (UsernameDoesnotExistException e) {
			throw new UsernameDoesnotExistException("Username is invalid");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * @param roleDao the roleDao to set
	 */
	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
	}
}
