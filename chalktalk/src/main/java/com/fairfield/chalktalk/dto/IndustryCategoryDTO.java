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
public class IndustryCategoryDTO {

	private @JsonProperty("id") long id;
	private @JsonProperty("industryCategory") String industryCategory;
	private @JsonProperty("order") int order;
	
	
	public IndustryCategoryDTO() {}

	/**
	 * @param id
	 * @param industryCategory
	 * @param order
	 */
	public IndustryCategoryDTO(long id, String industryCategory, int order) {
		super();
		this.id = id;
		this.industryCategory = industryCategory;
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
	 * @return the industryCategory
	 */
	public String getIndustryCategory() {
		return industryCategory;
	}

	/**
	 * @param industryCategory the industryCategory to set
	 */
	public void setIndustryCategory(String industryCategory) {
		this.industryCategory = industryCategory;
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
