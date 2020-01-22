/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
public class Mentee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long menteeId;
	@Column
	private String menteeName;
	
	@Column
	@ElementCollection(targetClass=ArrayList.class)
	private List<String> associateNames;
	
	@Column
	private String phoneNo;
	
	@Column
	private String emailId;
	
	@Column
	private String jobRole;
	
	@Column
	private boolean startUpExp;
	
	@JoinColumn(name = "mentorId", referencedColumnName="mentorId", insertable=false, updatable=false)
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Mentor mentor;
	
	@Column
	private Long startupApplicationId;
	
	/*@JoinColumn(name = "applicationId", referencedColumnName="applicationId", insertable=false, updatable=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<StartUpApplication> applications;*/

	public Mentee() {}
	

	/**
	 * @param menteeName
	 * @param associateNames
	 * @param phoneNo
	 * @param emailId
	 * @param jobRole
	 * @param startUpExp
	 * @param mentor
	 * @param applications
	 */
	public Mentee(String menteeName, List<String> associateNames, String phoneNo, String emailId, String jobRole,
			boolean startUpExp, Mentor mentor, List<StartUpApplication> applications) {
		super();
		this.menteeName = menteeName;
		this.associateNames = associateNames;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.jobRole = jobRole;
		this.startUpExp = startUpExp;
		this.mentor = mentor;
		//this.applications = applications;
	}









	/**
	 * @return the menteeName
	 */
	public String getMenteeName() {
		return menteeName;
	}

	/**
	 * @param menteeName the menteeName to set
	 */
	public void setMenteeName(String menteeName) {
		this.menteeName = menteeName;
	}

	/**
	 * @return the associateNames
	 */
	public List<String> getAssociateNames() {
		return associateNames;
	}

	/**
	 * @param associateNames the associateNames to set
	 */
	public void setAssociateNames(List<String> associateNames) {
		this.associateNames = associateNames;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @param phoneNo the phoneNo to set
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	/**
	 * @return the jobRole
	 */
	public String getJobRole() {
		return jobRole;
	}

	/**
	 * @param jobRole the jobRole to set
	 */
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	/**
	 * @return the startUpExp
	 */
	public boolean isStartUpExp() {
		return startUpExp;
	}

	/**
	 * @param startUpExp the startUpExp to set
	 */
	public void setStartUpExp(boolean startUpExp) {
		this.startUpExp = startUpExp;
	}

	/**
	 * @return the mentor
	 */
	public Mentor getMentor() {
		return mentor;
	}

	/**
	 * @param mentor the mentor to set
	 */
	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}


	/**
	 * @return the menteeId
	 */
	public long getMenteeId() {
		return menteeId;
	}


	/**
	 * @param menteeId the menteeId to set
	 */
	public void setMenteeId(long menteeId) {
		this.menteeId = menteeId;
	}


	/**
	 * @return the startupApplicationId
	 */
	public Long getStartupApplicationId() {
		return startupApplicationId;
	}


	/**
	 * @param startupApplicationId the startupApplicationId to set
	 */
	public void setStartupApplicationId(Long startupApplicationId) {
		this.startupApplicationId = startupApplicationId;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the application
	 *//*
	public List<StartUpApplication> getApplication() {
		return applications;
	}

	*//**
	 * @param application the application to set
	 *//*
	public void setApplication(List<StartUpApplication> application) {
		this.applications = application;
	}*/
	
}
