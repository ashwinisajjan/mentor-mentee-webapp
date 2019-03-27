/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class MeetUpLocation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long locId;
	
	@JoinColumn(referencedColumnName = "addressId")
	@OneToOne(cascade=CascadeType.ALL)
	private Address addressId;
	
	public MeetUpLocation() {}
	/**
	 * @param locId
	 * @param addressId
	 */
	public MeetUpLocation(long locId, Address addressId) {
		super();
		this.locId = locId;
		this.addressId = addressId;
	}
	/**
	 * @return the locId
	 */
	public long getLocId() {
		return locId;
	}
	/**
	 * @param locId the locId to set
	 */
	public void setLocId(long locId) {
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
