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
public class SearchRequestDTO {

	private @JsonProperty("searchCriteria") String searchCriteria;
	private @JsonProperty("searchInput") String searchInput;
	/**
	 * @return the searchCriteria
	 */
	public String getSearchCriteria() {
		return searchCriteria;
	}
	/**
	 * @param searchCriteria the searchCriteria to set
	 */
	public void setSearchCriteria(String searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	/**
	 * @return the searchInput
	 */
	public String getSearchInput() {
		return searchInput;
	}
	/**
	 * @param searchInput the searchInput to set
	 */
	public void setSearchInput(String searchInput) {
		this.searchInput = searchInput;
	}
	/**
	 * @param searchCriteria
	 * @param searchInput
	 */
	public SearchRequestDTO(String searchCriteria, String searchInput) {
		super();
		this.searchCriteria = searchCriteria;
		this.searchInput = searchInput;
	}
	
	public SearchRequestDTO() {}
}
