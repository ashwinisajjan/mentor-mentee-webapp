/**
 * 
 */
package com.fairfield.chalktalk.dto;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class StartUpApplicationDTO {

	private @JsonProperty("applicationId") long applicationId;
	private @JsonProperty("applicantName") String applicantName;
	private @JsonProperty("applicantJobRole") String applicantJobRole;
	private @JsonProperty("applicantEmailId") String applicantEmailId;
	private @JsonProperty("applicantPhoneNo") String applicantPhoneNo;
	private @JsonProperty("startUpName") String startUpName;
	private @JsonProperty("referredBy") String referredBy;
	
	private @JsonProperty("startUpLocation") AddressDTO startUpLocation;
	private @JsonProperty("startUpDesc") String startUpDesc;
	private @JsonProperty("linkedInProfile") String linkedInProfile;
	private @JsonProperty("website") String website;
	private @JsonProperty("companyStartDate") Date companyStartDate;
	private @JsonProperty("companyStage") String companyStage;
	private @JsonProperty("customers") List<String> customers;
	private @JsonProperty("competitors") List<String> competitors;
	private @JsonProperty("teamDetails") String teamDetails;
	private @JsonProperty("hadMentoringSession") boolean hadMentoringSession;
	private @JsonProperty("customerProblem") String customerProblem;
	private @JsonProperty("businessPlan") byte[] businessPlan;
	private @JsonProperty("pitchDeck") byte[] pitchDeck;
	private @JsonProperty("otherDocs") byte[] otherDocs;
	private @JsonProperty("isApplicationAccepted") boolean isApplicationAccepted;
	private @JsonProperty("applicationOwner") MenteeDTO applicationOwner;
	
	public StartUpApplicationDTO() {}
	/**
	 * @param applicationId
	 * @param applicantName
	 * @param applicantJobRole
	 * @param applicantEmailId
	 * @param applicantPhoneNo
	 * @param startUpName
	 * @param referredBy
	 * @param startUpLocation
	 * @param startUpDesc
	 * @param linkedInProfile
	 * @param website
	 * @param companyStartDate
	 * @param companyStage
	 * @param customers
	 * @param competitors
	 * @param teamDetails
	 * @param hadMentoringSession
	 * @param customerProblem
	 * @param businessPlan
	 * @param pitchDeck
	 * @param otherDocs
	 * @param isApplicationAccepted
	 * @param applicationOwner
	 */
	public StartUpApplicationDTO(long applicationId, String applicantName, String applicantJobRole,
			String applicantEmailId, String applicantPhoneNo, String startUpName, String referredBy,
			AddressDTO startUpLocation, String startUpDesc, String linkedInProfile, String website,
			Date companyStartDate, String companyStage, List<String> customers, List<String> competitors,
			String teamDetails, boolean hadMentoringSession, String customerProblem, byte[] businessPlan,
			byte[] pitchDeck, byte[] otherDocs, boolean isApplicationAccepted, MenteeDTO applicationOwner) {
		super();
		this.applicationId = applicationId;
		this.applicantName = applicantName;
		this.applicantJobRole = applicantJobRole;
		this.applicantEmailId = applicantEmailId;
		this.applicantPhoneNo = applicantPhoneNo;
		this.startUpName = startUpName;
		this.referredBy = referredBy;
		this.startUpLocation = startUpLocation;
		this.startUpDesc = startUpDesc;
		this.linkedInProfile = linkedInProfile;
		this.website = website;
		this.companyStartDate = companyStartDate;
		this.companyStage = companyStage;
		this.customers = customers;
		this.competitors = competitors;
		this.teamDetails = teamDetails;
		this.hadMentoringSession = hadMentoringSession;
		this.customerProblem = customerProblem;
		this.businessPlan = businessPlan;
		this.pitchDeck = pitchDeck;
		this.otherDocs = otherDocs;
		this.isApplicationAccepted = isApplicationAccepted;
		this.applicationOwner = applicationOwner;
	}
	/**
	 * @return the applicationId
	 */
	public long getApplicationId() {
		return applicationId;
	}
	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}
	/**
	 * @return the applicantName
	 */
	public String getApplicantName() {
		return applicantName;
	}
	/**
	 * @param applicantName the applicantName to set
	 */
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	/**
	 * @return the applicantJobRole
	 */
	public String getApplicantJobRole() {
		return applicantJobRole;
	}
	/**
	 * @param applicantJobRole the applicantJobRole to set
	 */
	public void setApplicantJobRole(String applicantJobRole) {
		this.applicantJobRole = applicantJobRole;
	}
	/**
	 * @return the applicantEmailId
	 */
	public String getApplicantEmailId() {
		return applicantEmailId;
	}
	/**
	 * @param applicantEmailId the applicantEmailId to set
	 */
	public void setApplicantEmailId(String applicantEmailId) {
		this.applicantEmailId = applicantEmailId;
	}
	/**
	 * @return the applicantPhoneNo
	 */
	public String getApplicantPhoneNo() {
		return applicantPhoneNo;
	}
	/**
	 * @param applicantPhoneNo the applicantPhoneNo to set
	 */
	public void setApplicantPhoneNo(String applicantPhoneNo) {
		this.applicantPhoneNo = applicantPhoneNo;
	}
	/**
	 * @return the startUpName
	 */
	public String getStartUpName() {
		return startUpName;
	}
	/**
	 * @param startUpName the startUpName to set
	 */
	public void setStartUpName(String startUpName) {
		this.startUpName = startUpName;
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
	 * @return the startUpLocation
	 */
	public AddressDTO getStartUpLocation() {
		return startUpLocation;
	}
	/**
	 * @param startUpLocation the startUpLocation to set
	 */
	public void setStartUpLocation(AddressDTO startUpLocation) {
		this.startUpLocation = startUpLocation;
	}
	/**
	 * @return the startUpDesc
	 */
	public String getStartUpDesc() {
		return startUpDesc;
	}
	/**
	 * @param startUpDesc the startUpDesc to set
	 */
	public void setStartUpDesc(String startUpDesc) {
		this.startUpDesc = startUpDesc;
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
	 * @return the website
	 */
	public String getWebsite() {
		return website;
	}
	/**
	 * @param website the website to set
	 */
	public void setWebsite(String website) {
		this.website = website;
	}
	/**
	 * @return the companyStartDate
	 */
	public Date getCompanyStartDate() {
		return companyStartDate;
	}
	/**
	 * @param companyStartDate the companyStartDate to set
	 */
	public void setCompanyStartDate(Date companyStartDate) {
		this.companyStartDate = companyStartDate;
	}
	/**
	 * @return the companyStage
	 */
	public String getCompanyStage() {
		return companyStage;
	}
	/**
	 * @param companyStage the companyStage to set
	 */
	public void setCompanyStage(String companyStage) {
		this.companyStage = companyStage;
	}
	/**
	 * @return the customers
	 */
	public List<String> getCustomers() {
		return customers;
	}
	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	/**
	 * @return the competitors
	 */
	public List<String> getCompetitors() {
		return competitors;
	}
	/**
	 * @param competitors the competitors to set
	 */
	public void setCompetitors(List<String> competitors) {
		this.competitors = competitors;
	}
	/**
	 * @return the teamDetails
	 */
	public String getTeamDetails() {
		return teamDetails;
	}
	/**
	 * @param teamDetails the teamDetails to set
	 */
	public void setTeamDetails(String teamDetails) {
		this.teamDetails = teamDetails;
	}
	/**
	 * @return the hadMentoringSession
	 */
	public boolean isHadMentoringSession() {
		return hadMentoringSession;
	}
	/**
	 * @param hadMentoringSession the hadMentoringSession to set
	 */
	public void setHadMentoringSession(boolean hadMentoringSession) {
		this.hadMentoringSession = hadMentoringSession;
	}
	/**
	 * @return the customerProblem
	 */
	public String getCustomerProblem() {
		return customerProblem;
	}
	/**
	 * @param customerProblem the customerProblem to set
	 */
	public void setCustomerProblem(String customerProblem) {
		this.customerProblem = customerProblem;
	}
	/**
	 * @return the businessPlan
	 */
	public byte[] getBusinessPlan() {
		return businessPlan;
	}
	/**
	 * @param businessPlan the businessPlan to set
	 */
	public void setBusinessPlan(byte[] businessPlan) {
		this.businessPlan = businessPlan;
	}
	/**
	 * @return the pitchDeck
	 */
	public byte[] getPitchDeck() {
		return pitchDeck;
	}
	/**
	 * @param pitchDeck the pitchDeck to set
	 */
	public void setPitchDeck(byte[] pitchDeck) {
		this.pitchDeck = pitchDeck;
	}
	/**
	 * @return the otherDocs
	 */
	public byte[] getOtherDocs() {
		return otherDocs;
	}
	/**
	 * @param otherDocs the otherDocs to set
	 */
	public void setOtherDocs(byte[] otherDocs) {
		this.otherDocs = otherDocs;
	}
	/**
	 * @return the isApplicationAccepted
	 */
	public boolean isApplicationAccepted() {
		return isApplicationAccepted;
	}
	/**
	 * @param isApplicationAccepted the isApplicationAccepted to set
	 */
	public void setApplicationAccepted(boolean isApplicationAccepted) {
		this.isApplicationAccepted = isApplicationAccepted;
	}
	/**
	 * @return the applicationOwner
	 */
	public MenteeDTO getApplicationOwner() {
		return applicationOwner;
	}
	/**
	 * @param applicationOwner the applicationOwner to set
	 */
	public void setApplicationOwner(MenteeDTO applicationOwner) {
		this.applicationOwner = applicationOwner;
	}
}
