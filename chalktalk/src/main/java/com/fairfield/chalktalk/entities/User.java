/**
 * 
 */
package com.fairfield.chalktalk.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Ashwini Sajjan
 *
 */
@MappedSuperclass
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String userId;
	
	@Column
	private String userName;
	
	@Column
	private String password;
	
	@Column
	private String userType;
	
	@Column
	private String permissions;

	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param userType
	 * @param permissions
	 */
	public User(String userId, String userName, String password, String userType, String permissions) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.permissions = permissions;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the permissions
	 */
	public String getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	
}
