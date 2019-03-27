/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
@AttributeOverrides({
    @AttributeOverride(name="userId", column=@Column(name="adminId")),
})
public class Admin extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String name;
	@Column
	private String phoneNum;
	@Column
	private String emailId;
	
	public Admin() {}
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param userType
	 * @param permissions
	 * @param name
	 * @param phoneNum
	 * @param emailId
	 */
	public Admin(long userId, String userName, String password, String userType, String permissions, String name,
			String phoneNum, String emailId) {
		super(userId, userName, password, userType, permissions);
		this.name = name;
		this.phoneNum = phoneNum;
		this.emailId = emailId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
