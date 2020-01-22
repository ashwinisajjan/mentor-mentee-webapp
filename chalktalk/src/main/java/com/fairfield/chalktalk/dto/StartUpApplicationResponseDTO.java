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
public class StartUpApplicationResponseDTO {
	
	private @JsonProperty("applicationId") Long applicationId;
	private @JsonProperty("startUpName") String startUpName;
	private @JsonProperty("deatilsDoc") String deatilsDoc;
	private @JsonProperty("businessdoc") String businessdoc;
	private @JsonProperty("pitchdeck") String pitchdeck;
	private @JsonProperty("otherdoc") String otherdoc;
	
	public StartUpApplicationResponseDTO() {}

	/**
	 * @return the applicationId
	 */
	public Long getApplicationId() {
		return applicationId;
	}

	/**
	 * @param applicationId the applicationId to set
	 */
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * @return the deatilsDoc
	 */
	public String getDeatilsDoc() {
		return deatilsDoc;
	}

	/**
	 * @param deatilsDoc the deatilsDoc to set
	 */
	public void setDeatilsDoc(String deatilsDoc) {
		this.deatilsDoc = deatilsDoc;
	}

	/**
	 * @return the businessdoc
	 */
	public String getBusinessdoc() {
		return businessdoc;
	}

	/**
	 * @param businessdoc the businessdoc to set
	 */
	public void setBusinessdoc(String businessdoc) {
		this.businessdoc = businessdoc;
	}

	/**
	 * @return the pitchdeck
	 */
	public String getPitchdeck() {
		return pitchdeck;
	}

	/**
	 * @param pitchdeck the pitchdeck to set
	 */
	public void setPitchdeck(String pitchdeck) {
		this.pitchdeck = pitchdeck;
	}

	/**
	 * @return the otherdoc
	 */
	public String getOtherdoc() {
		return otherdoc;
	}

	/**
	 * @param otherdoc the otherdoc to set
	 */
	public void setOtherdoc(String otherdoc) {
		this.otherdoc = otherdoc;
	}

	/**
	 * @return the startUpName
	 */
	public String getStartUpName() {
		return startUpName;
	}

	/**
	 * @param startUpName the startUpName to set
	 */
	public void setStartUpName(String startUpName) {
		this.startUpName = startUpName;
	}
}
