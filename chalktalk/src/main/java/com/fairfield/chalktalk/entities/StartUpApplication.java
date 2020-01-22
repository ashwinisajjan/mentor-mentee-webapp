/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
public class StartUpApplication implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long applicationId;
	@Column
	private String applicantName;
	@Column
	private String applicantJobRole;
	@Column
	private String applicantEmailId;
	@Column
	private String applicantPhoneNo;
	@Column
	private String startUpName;
	@Column
	private String referredBy;
	@Column
	private String city;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String startUpDesc;
	@Column
	private String linkedInProfile;
	@Column
	private String website;
	/*@Column
	private Date companyStartDate;*/
	@Column
	private String companyStartDate;
	@Column
	private String companyStage;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String targetCustomers;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String currentCompetitors;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String teamDetails;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String primaryGoal;
	@Basic(fetch = FetchType.LAZY) 
	@Lob
	private String amountOfWorkPut;
	@Column
	private boolean mentoringsession;
	@Column
	private boolean priorExperience;
	@Column
	private String customerProblem;
	
	/*@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] businessPlan;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] pitchDeck;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] otherDocs;*/
	@ElementCollection(fetch=FetchType.EAGER)
	@CollectionTable(name="startupFileUploads", joinColumns=@JoinColumn(name="applicationId"))
	private List<FileUpload> fileUploads = new ArrayList<FileUpload>();
	@Column
	private boolean isApplicationAccepted;
	
	@JoinColumn(name = "menteeId", referencedColumnName="menteeId", insertable=false, updatable=false)
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Mentee mentee;
	
	public StartUpApplication() {}

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
	 * @return the targetCustomers
	 */
	public String getTargetCustomers() {
		return targetCustomers;
	}

	/**
	 * @param targetCustomers the targetCustomers to set
	 */
	public void setTargetCustomers(String targetCustomers) {
		this.targetCustomers = targetCustomers;
	}

	/**
	 * @return the currentCompetitors
	 */
	public String getCurrentCompetitors() {
		return currentCompetitors;
	}

	/**
	 * @param currentCompetitors the currentCompetitors to set
	 */
	public void setCurrentCompetitors(String currentCompetitors) {
		this.currentCompetitors = currentCompetitors;
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
	 * @return the mentoringsession
	 */
	public boolean isMentoringsession() {
		return mentoringsession;
	}

	/**
	 * @param mentoringsession the mentoringsession to set
	 */
	public void setMentoringsession(boolean mentoringsession) {
		this.mentoringsession = mentoringsession;
	}

	/**
	 * @return the priorExperience
	 */
	public boolean isPriorExperience() {
		return priorExperience;
	}

	/**
	 * @param priorExperience the priorExperience to set
	 */
	public void setPriorExperience(boolean priorExperience) {
		this.priorExperience = priorExperience;
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
	 * @return the fileUploads
	 */
	public List<FileUpload> getFileUploads() {
		return fileUploads;
	}

	/**
	 * @param fileUploads the fileUploads to set
	 */
	public void setFileUploads(List<FileUpload> fileUploads) {
		this.fileUploads = fileUploads;
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
