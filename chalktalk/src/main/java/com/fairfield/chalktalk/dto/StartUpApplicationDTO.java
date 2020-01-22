/**
 * 
 */
package com.fairfield.chalktalk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class StartUpApplicationDTO {

	private @JsonProperty("applicantName") String applicantName;
	private @JsonProperty("applicantJobRole") String applicantJobRole;
	private @JsonProperty("applicantEmailId") String applicantEmailId;
	private @JsonProperty("applicantPhoneNo") String applicantPhoneNo;
	private @JsonProperty("startUpName") String startUpName;
	private @JsonProperty("referredBy") String referredBy;
	private @JsonProperty("city") String city;
	private @JsonProperty("startUpDesc") String startUpDesc;
	private @JsonProperty("linkedInProfile") String linkedInProfile;
	private @JsonProperty("website") String website;
	private @JsonProperty("companyStartDate") String companyStartDate;
	private @JsonProperty("companyStage") String companyStage;
	private @JsonProperty("targetCustomers") String targetCustomers;
	private @JsonProperty("currentCompetitors") String currentCompetitors;
	private @JsonProperty("teamDetails") String teamDetails;
	private @JsonProperty("hadMentoringSession") boolean hadMentoringSession;
	private @JsonProperty("amountOfWorkPut") String amountOfWorkPut;
	private @JsonProperty("primaryGoal") String primaryGoal;
	private @JsonProperty("priorExperience") boolean hadPriorExperience;
	
	public StartUpApplicationDTO() {}

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
	public String getCompanyStartDate() {
		return companyStartDate;
	}

	/**
	 * @param companyStartDate the companyStartDate to set
	 */
	public void setCompanyStartDate(String companyStartDate) {
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
	public String getCustomers() {
		return targetCustomers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(String customers) {
		this.targetCustomers = customers;
	}

	/**
	 * @return the competitors
	 */
	public String getCompetitors() {
		return currentCompetitors;
	}

	/**
	 * @param competitors the competitors to set
	 */
	public void setCompetitors(String competitors) {
		this.currentCompetitors = competitors;
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
	 * @return the amountOfWorkPut
	 */
	public String getAmountOfWorkPut() {
		return amountOfWorkPut;
	}

	/**
	 * @param amountOfWorkPut the amountOfWorkPut to set
	 */
	public void setAmountOfWorkPut(String amountOfWorkPut) {
		this.amountOfWorkPut = amountOfWorkPut;
	}

	/**
	 * @return the primaryGoal
	 */
	public String getPrimaryGoal() {
		return primaryGoal;
	}

	/**
	 * @param primaryGoal the primaryGoal to set
	 */
	public void setPrimaryGoal(String primaryGoal) {
		this.primaryGoal = primaryGoal;
	}

	/**
	 * @return the hadPriorExperience
	 */
	public boolean isHadPriorExperience() {
		return hadPriorExperience;
	}

	/**
	 * @param hadPriorExperience the hadPriorExperience to set
	 */
	public void setHadPriorExperience(boolean hadPriorExperience) {
		this.hadPriorExperience = hadPriorExperience;
	}
}
