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
public class MentorResponseDTO {
	
	private @JsonProperty("mentorId") Long mentorId;
	private @JsonProperty("mentorName") String mentorName;
	private @JsonProperty("phoneNo") String phoneNo;
	//private @JsonProperty("emailId") String emailId;
	private @JsonProperty("referredBy") String referredBy;
	/*private @JsonProperty("linkedInProfile") String linkedInProfile;
	private @JsonProperty("addressline1") String addressline1;
	private @JsonProperty("addressline2") String addressline2;
	private @JsonProperty("city") String city;
	private @JsonProperty("county") String county;
	private @JsonProperty("state") String state;*/
	private @JsonProperty("primaryserviceindustry") String primaryserviceindustry;
	private @JsonProperty("areasOfExpertise") List<String> areasOfExpertise;
	private @JsonProperty("resume") String resume;
	private @JsonProperty("certificates") String certificates;
	
	public MentorResponseDTO() {}
	/**
	 * @param mentorName
	 * @param phoneNo
	 * @param emailId
	 * @param referredBy
	 * @param linkedInProfile
	 * @param addressline1
	 * @param addressline2
	 * @param city
	 * @param county
	 * @param state
	 * @param primaryserviceindustry
	 * @param areasOfExpertise
	 * @param resume
	 * @param certificates
	 */
	public MentorResponseDTO(Long mentorId, String mentorName, String phoneNo, String emailId, String referredBy,
			String linkedInProfile, String addressline1, String addressline2, String city, String county, String state,
			String primaryserviceindustry, List<String> areasOfExpertise, String resume, String certificates) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.phoneNo = phoneNo;
		//this.emailId = emailId;
		this.referredBy = referredBy;
		/*this.linkedInProfile = linkedInProfile;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.county = county;
		this.state = state;*/
		this.primaryserviceindustry = primaryserviceindustry;
		this.areasOfExpertise = areasOfExpertise;
		this.resume = resume;
		this.certificates = certificates;
	}
	/**
	 * @return the mentorName
	 */
	public String getMentorName() {
		return mentorName;
	}
	/**
	 * @param mentorName the mentorName to set
	 */
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
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
	 *//*
	public String getEmailId() {
		return emailId;
	}
	*//**
	 * @param emailId the emailId to set
	 *//*
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}*/
	/**
	 * @return the referredBy
	 */
	public String getReferredBy() {
		return referredBy;
	}
	/**
	 * @param referredBy the referredBy to set
	 */
	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}
	/**
	 * @return the linkedInProfile
	 *//*
	public String getLinkedInProfile() {
		return linkedInProfile;
	}
	*//**
	 * @param linkedInProfile the linkedInProfile to set
	 *//*
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	*//**
	 * @return the addressline1
	 *//*
	public String getAddressline1() {
		return addressline1;
	}
	*//**
	 * @param addressline1 the addressline1 to set
	 *//*
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	*//**
	 * @return the addressline2
	 *//*
	public String getAddressline2() {
		return addressline2;
	}
	*//**
	 * @param addressline2 the addressline2 to set
	 *//*
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	*//**
	 * @return the city
	 *//*
	public String getCity() {
		return city;
	}
	*//**
	 * @param city the city to set
	 *//*
	public void setCity(String city) {
		this.city = city;
	}
	*//**
	 * @return the county
	 *//*
	public String getCounty() {
		return county;
	}
	*//**
	 * @param county the county to set
	 *//*
	public void setCounty(String county) {
		this.county = county;
	}
	*//**
	 * @return the state
	 *//*
	public String getState() {
		return state;
	}
	*//**
	 * @param state the state to set
	 *//*
	public void setState(String state) {
		this.state = state;
	}*/
	/**
	 * @return the primaryserviceindustry
	 */
	public String getPrimaryserviceindustry() {
		return primaryserviceindustry;
	}
	/**
	 * @param primaryserviceindustry the primaryserviceindustry to set
	 */
	public void setPrimaryserviceindustry(String primaryserviceindustry) {
		this.primaryserviceindustry = primaryserviceindustry;
	}
	/**
	 * @return the areasOfExpertise
	 */
	public List<String> getAreasOfExpertise() {
		return areasOfExpertise;
	}
	/**
	 * @param areasOfExpertise the areasOfExpertise to set
	 */
	public void setAreasOfExpertise(List<String> areasOfExpertise) {
		this.areasOfExpertise = areasOfExpertise;
	}
	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}
	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	/**
	 * @return the certificates
	 */
	public String getCertificates() {
		return certificates;
	}
	/**
	 * @param certificates the certificates to set
	 */
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	/**
	 * @return the mentorId
	 */
	public Long getMentorId() {
		return mentorId;
	}
	/**
	 * @param mentorId the mentorId to set
	 */
	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}
}
