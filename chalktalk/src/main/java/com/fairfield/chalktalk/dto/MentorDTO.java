/**
 * 
 */
package com.fairfield.chalktalk.dto;

import java.util.List;

import com.fairfield.chalktalk.entities.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class MentorDTO extends UserDTO{
	
	private @JsonProperty("mentorName") String mentorName;
	private @JsonProperty("address") Address address;
	private @JsonProperty("phoneNo") String phoneNo;
	private @JsonProperty("emailId") String emailId;
	private @JsonProperty("referredBy") String referredBy;
	private @JsonProperty("linkedInProfile") String linkedInProfile;
	private @JsonProperty("areaOfExpertise") List<String> areaOfExpertise;
	private @JsonProperty("resume") byte[] resume; 
	private @JsonProperty("profilePicture") byte[] profilePicture;
	private @JsonProperty("mentees") List<MenteeDTO> mentees;
	
	public MentorDTO() {}
	/**
	 * @param mentorName
	 * @param address
	 * @param phoneNo
	 * @param emailId
	 * @param referredBy
	 * @param linkedInProfile
	 * @param areaOfExpertise
	 * @param resume
	 * @param profilePicture
	 * @param mentees
	 */
	public MentorDTO(String mentorName, Address address, String phoneNo, String emailId, String referredBy,
			String linkedInProfile, List<String> areaOfExpertise, byte[] resume, byte[] profilePicture,
			List<MenteeDTO> mentees) {
		super();
		this.mentorName = mentorName;
		this.address = address;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.referredBy = referredBy;
		this.linkedInProfile = linkedInProfile;
		this.areaOfExpertise = areaOfExpertise;
		this.resume = resume;
		this.profilePicture = profilePicture;
		this.mentees = mentees;
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
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
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
	 */
	public String getLinkedInProfile() {
		return linkedInProfile;
	}
	/**
	 * @param linkedInProfile the linkedInProfile to set
	 */
	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}
	/**
	 * @return the areaOfExpertise
	 */
	public List<String> getAreaOfExpertise() {
		return areaOfExpertise;
	}
	/**
	 * @param areaOfExpertise the areaOfExpertise to set
	 */
	public void setAreaOfExpertise(List<String> areaOfExpertise) {
		this.areaOfExpertise = areaOfExpertise;
	}
	/**
	 * @return the resume
	 */
	public byte[] getResume() {
		return resume;
	}
	/**
	 * @param resume the resume to set
	 */
	public void setResume(byte[] resume) {
		this.resume = resume;
	}
	/**
	 * @return the profilePicture
	 */
	public byte[] getProfilePicture() {
		return profilePicture;
	}
	/**
	 * @param profilePicture the profilePicture to set
	 */
	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}
	/**
	 * @return the mentees
	 */
	public List<MenteeDTO> getMentees() {
		return mentees;
	}
	/**
	 * @param mentees the mentees to set
	 */
	public void setMentees(List<MenteeDTO> mentees) {
		this.mentees = mentees;
	}
	
}
