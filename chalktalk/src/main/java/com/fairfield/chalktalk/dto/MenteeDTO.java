/**
 * 
 */
package com.fairfield.chalktalk.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class MenteeDTO extends UserDTO{
	private @JsonProperty("menteeName") String menteeName;
	private @JsonProperty("associateNames") List<String> associateNames;
	private @JsonProperty("phoneNo") String phoneNo;
	private @JsonProperty("emailId") String emailId;
	private @JsonProperty("jobRole") String jobRole;
	private @JsonProperty("startUpExp") boolean startUpExp;
	private @JsonProperty("mentor") MentorDTO mentor;
	private @JsonProperty("applications") List<StartUpApplicationDTO> applications;
	/**
	 * @return the menteeName
	 */
	public String getMenteeName() {
		return menteeName;
	}
	public MenteeDTO() {}
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
	public MenteeDTO(String menteeName, List<String> associateNames, String phoneNo, String emailId, String jobRole,
			boolean startUpExp, MentorDTO mentor, List<StartUpApplicationDTO> applications) {
		super();
		this.menteeName = menteeName;
		this.associateNames = associateNames;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.jobRole = jobRole;
		this.startUpExp = startUpExp;
		this.mentor = mentor;
		this.applications = applications;
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
	public MentorDTO getMentor() {
		return mentor;
	}
	/**
	 * @param mentor the mentor to set
	 */
	public void setMentor(MentorDTO mentor) {
		this.mentor = mentor;
	}
	/**
	 * @return the applications
	 */
	public List<StartUpApplicationDTO> getApplications() {
		return applications;
	}
	/**
	 * @param applications the applications to set
	 */
	public void setApplications(List<StartUpApplicationDTO> applications) {
		this.applications = applications;
	}
}
