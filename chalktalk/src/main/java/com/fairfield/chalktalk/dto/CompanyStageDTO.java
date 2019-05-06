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
public class CompanyStageDTO {

	private @JsonProperty("companyStageId") long companyStageId;
	private @JsonProperty("stage") String stage;
	private @JsonProperty("order") int order;
	
	
	public CompanyStageDTO() {}

	/**
	 * @param companyStageId
	 * @param stage
	 * @param order
	 */
	public CompanyStageDTO(long companyStageId, String stage, int order) {
		super();
		this.companyStageId = companyStageId;
		this.stage = stage;
		this.order = order;
	}



	/**
	 * @return the companyStageId
	 */
	public long getCompanyStageId() {
		return companyStageId;
	}


	/**
	 * @param companyStageId the companyStageId to set
	 */
	public void setCompanyStageId(long companyStageId) {
		this.companyStageId = companyStageId;
	}


	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}


	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) {
		this.stage = stage;
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
