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
public class MentorProfileResponseDTO {
	private @JsonProperty("mentorName") String mentorName;
	private @JsonProperty("linkedInProfile") String linkedInProfile;
	private @JsonProperty("emailId") String emailId;
	private @JsonProperty("primaryserviceindustry") String primaryserviceindustry;
	private @JsonProperty("areasOfExpertise") List<String> areasOfExpertise;
	private @JsonProperty("city") String city;
	private @JsonProperty("county") String county;
	private @JsonProperty("profilePic") String profilePic;
	
	public MentorProfileResponseDTO() {}
	
	/**
	 * @param mentorName
	 * @param linkedInProfile
	 * @param emailId
	 * @param primaryserviceindustry
	 * @param areasOfExpertise
	 * @param city
	 * @param county
	 * @param profilePic
	 */
	public MentorProfileResponseDTO(String mentorName, String linkedInProfile, String emailId,
			String primaryserviceindustry, List<String> areasOfExpertise, String city, String county,
			String profilePic) {
		super();
		this.mentorName = mentorName;
		this.linkedInProfile = linkedInProfile;
		this.emailId = emailId;
		this.primaryserviceindustry = primaryserviceindustry;
		this.areasOfExpertise = areasOfExpertise;
		this.city = city;
		this.county = county;
		this.profilePic = profilePic;
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
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the county
	 */
	public String getCounty() {
		return county;
	}


	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}


	/**
	 * @return the profilePic
	 */
	public String getProfilePic() {
		return profilePic;
	}


	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
}
