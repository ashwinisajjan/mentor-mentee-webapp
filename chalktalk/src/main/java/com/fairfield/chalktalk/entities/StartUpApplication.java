/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToOne;
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
	
	@JoinColumn(name = "addressId")
	@OneToOne(cascade = CascadeType.ALL)
	private Address startUpLocation;
	@Column
	private String startUpDesc;
	@Column
	private String linkedInProfile;
	@Column
	private String website;
	@Column
	private Date companyStartDate;
	@Column
	private String companyStage;
	@Column
	@ElementCollection(targetClass=ArrayList.class)
	private List<String> customers;
	@Column
	@ElementCollection(targetClass=ArrayList.class)
	private List<String> competitors;
	@Column
	private String teamDetails;
	@Column
	private boolean hadMentoringSession;
	@Column
	private String customerProblem;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] businessPlan;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] pitchDeck;
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] otherDocs;
	@Column
	private boolean isApplicationAccepted;
	@JoinColumn(name = "menteeId")
	@ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
	private Mentee applicationOwner;
	
	public StartUpApplication() {}
	/**
	 * @param id
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
	 */
	public StartUpApplication(long id, String applicantName, String applicantJobRole, String applicantEmailId,
			String applicantPhoneNo, String startUpName, String referredBy, Address startUpLocation, String startUpDesc,
			String linkedInProfile, String website, Date companyStartDate, String companyStage, List<String> customers,
			List<String> competitors, String teamDetails, boolean hadMentoringSession, String customerProblem,
			byte[] businessPlan, byte[] pitchDeck, byte[] otherDocs, boolean isApplicationAccepted) {
		super();
		this.applicationId = id;
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
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return applicationId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.applicationId = id;
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
	public Address getStartUpLocation() {
		return startUpLocation;
	}
	/**
	 * @param startUpLocation the startUpLocation to set
	 */
	public void setStartUpLocation(Address startUpLocation) {
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
	
}
