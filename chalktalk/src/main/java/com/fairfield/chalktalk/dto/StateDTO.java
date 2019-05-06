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
public class StateDTO {

	private @JsonProperty("stateId") long stateId;
	private @JsonProperty("state") String state;
	
	
	public StateDTO() {}

	/**
	 * @param stateId
	 * @param state
	 */
	public StateDTO(long stateId, String state) {
		super();
		this.stateId = stateId;
		this.state = state;
	}



	/**
	 * @return the stateId
	 */
	public long getStateId() {
		return stateId;
	}


	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(long stateId) {
		this.stateId = stateId;
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
