/**
 * 
 */
package com.fairfield.chalktalk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class ApplicationStatusDTO {

	private @JsonProperty("id") Long id;
	private @JsonProperty("applicationDecision") boolean applicationDecision;
	
	public ApplicationStatusDTO() {}
	/**
	 * @param id
	 * @param applicationDecision
	 */
	public ApplicationStatusDTO(Long id, boolean applicationDecision) {
		super();
		this.id = id;
		this.applicationDecision = applicationDecision;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the applicationDecision
	 */
	public boolean getApplicationDecision() {
		return applicationDecision;
	}
	/**
	 * @param applicationDecision the applicationDecision to set
	 */
	public void setApplicationDecision(boolean applicationDecision) {
		this.applicationDecision = applicationDecision;
	}
}
