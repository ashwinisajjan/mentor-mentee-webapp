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
public class MentorSpecilizationDTO {

	private @JsonProperty("id") long id;
	private @JsonProperty("aPSIndustry") String aPSIndustry;
	private @JsonProperty("specialization") String specialization;
	private @JsonProperty("order") int order;
	
	public MentorSpecilizationDTO() {}

	/**
	 * @param id
	 * @param aPSIndustry
	 * @param specialization
	 * @param order
	 */
	public MentorSpecilizationDTO(long id, String aPSIndustry, String specialization, int order) {
		super();
		this.id = id;
		this.aPSIndustry = aPSIndustry;
		this.specialization = specialization;
		this.order = order;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the aPSIndustry
	 */
	public String getaPSIndustry() {
		return aPSIndustry;
	}


	/**
	 * @param aPSIndustry the aPSIndustry to set
	 */
	public void setaPSIndustry(String aPSIndustry) {
		this.aPSIndustry = aPSIndustry;
	}


	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}


	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	/**
	 * @return the order
	 */
	public int getOrder() {
		return order;
	}


	/**
	 * @param order the order to set
	 */
	public void setOrder(int order) {
		this.order = order;
	}
}
