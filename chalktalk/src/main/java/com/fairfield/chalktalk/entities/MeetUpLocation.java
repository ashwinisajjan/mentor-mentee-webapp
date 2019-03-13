/**
 * 
 */
package com.fairfield.chalktalk.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
public class MeetUpLocation {

	@Id
	private String locId;
	
	@JoinColumn(name = "addressId")
	@OneToOne(cascade=CascadeType.ALL)
	private Address addressId;
	/**
	 * @param locId
	 * @param addressId
	 */
	public MeetUpLocation(String locId, Address addressId) {
		super();
		this.locId = locId;
		this.addressId = addressId;
	}
	/**
	 * @return the locId
	 */
	public String getLocId() {
		return locId;
	}
	/**
	 * @param locId the locId to set
	 */
	public void setLocId(String locId) {
		this.locId = locId;
	}
	/**
	 * @return the addressId
	 */
	public Address getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}
	
}
