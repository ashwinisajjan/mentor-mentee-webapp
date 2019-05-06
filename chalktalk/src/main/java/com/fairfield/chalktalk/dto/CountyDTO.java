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
public class CountyDTO {

	private @JsonProperty("countyId") long countyId;
	private @JsonProperty("county") String county;
	private @JsonProperty("state") String state;
	
	
	public CountyDTO() {}

	/**
	 * @param countyId
	 * @param county
	 * @param state
	 */
	public CountyDTO(long countyId, String county, String state) {
		super();
		this.countyId = countyId;
		this.county = county;
		this.state = state;
	}

	/**
	 * @return the countyId
	 */
	public long getCountyId() {
		return countyId;
	}


	/**
	 * @param countyId the countyId to set
	 */
	public void setCountyId(long countyId) {
		this.countyId = countyId;
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
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
}
