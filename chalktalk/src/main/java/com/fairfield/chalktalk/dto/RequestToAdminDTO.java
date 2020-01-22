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
public class RequestToAdminDTO {

	private @JsonProperty("requestId") Long requestId;
	private @JsonProperty("whoIsRequesting") Long whoIsRequesting;
	private @JsonProperty("requestingFor") Long requestingFor;
	private @JsonProperty("requesterEmailId") String requesterEmailId;
	private @JsonProperty("status") String status;
	
	/**
	 * @param requestId
	 * @param whoIsRequesting
	 * @param requestingFor
	 * @param requesterEmailId
	 * @param status
	 */
	public RequestToAdminDTO(Long requestId, Long whoIsRequesting, Long requestingFor, String requesterEmailId,
			String status) {
		super();
		this.requestId = requestId;
		this.whoIsRequesting = whoIsRequesting;
		this.requestingFor = requestingFor;
		this.requesterEmailId = requesterEmailId;
		this.status = status;
	}
	/**
	 * @return the requestId
	 */
	public Long getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	/**
	 * @return the whoIsRequesting
	 */
	public Long getWhoIsRequesting() {
		return whoIsRequesting;
	}
	/**
	 * @param whoIsRequesting the whoIsRequesting to set
	 */
	public void setWhoIsRequesting(Long whoIsRequesting) {
		this.whoIsRequesting = whoIsRequesting;
	}
	/**
	 * @return the requestingFor
	 */
	public Long getRequestingFor() {
		return requestingFor;
	}
	/**
	 * @param requestingFor the requestingFor to set
	 */
	public void setRequestingFor(Long requestingFor) {
		this.requestingFor = requestingFor;
	}
	/**
	 * @return the requesterEmailId
	 */
	public String getRequesterEmailId() {
		return requesterEmailId;
	}
	/**
	 * @param requesterEmailId the requesterEmailId to set
	 */
	public void setRequesterEmailId(String requesterEmailId) {
		this.requesterEmailId = requesterEmailId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
