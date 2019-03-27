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
public class MeetUpLocationDTO {

	private @JsonProperty("locId") long locId;
	private @JsonProperty("addressId") AddressDTO addressId;
	
	public MeetUpLocationDTO() {}
	/**
	 * @param locId
	 * @param addressId
	 */
	public MeetUpLocationDTO(long locId, AddressDTO addressId) {
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
	public AddressDTO getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(AddressDTO addressId) {
		this.addressId = addressId;
	}
}
