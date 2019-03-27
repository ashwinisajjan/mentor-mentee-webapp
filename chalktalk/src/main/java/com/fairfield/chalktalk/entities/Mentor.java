/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
@AttributeOverrides({
    @AttributeOverride(name="userId", column=@Column(name="mentorId")),
})
public class Mentor extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String mentorName;
	
	@JoinColumn(name = "addressId")
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	@Column
	private String phoneNo;
	
	@Column
	private String emailId;
	
	@Column
	private String referredBy;
	
	@Column
	private String linkedInProfile;
	
	@Column
	@ElementCollection(targetClass=ArrayList.class)
	private List<String> areaOfExpertise;
	
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] resume; 
	
	@Lob @Basic(fetch = FetchType.LAZY)
	@Column (nullable=false, columnDefinition="BLOB NOT NULL")
	private byte[] profilePicture;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="mentor")
	private List<Mentee> mentees;

	public Mentor() {}
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param userType
	 * @param permissions
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
	public Mentor(long userId, String userName, String password, String userType, String permissions,
			String mentorName, Address address, String phoneNo, String emailId, String referredBy,
			String linkedInProfile, List<String> areaOfExpertise, byte[] resume, byte[] profilePicture,
			List<Mentee> mentees) {
		super(userId, userName, password, userType, permissions);
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
	public List<Mentee> getMentees() {
		return mentees;
	}

	/**
	 * @param mentees the mentees to set
	 */
	public void setMentees(List<Mentee> mentees) {
		this.mentees = mentees;
	}
	
}
