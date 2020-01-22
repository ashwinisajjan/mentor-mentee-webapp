/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
public class RequestsToAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long requestId;
	@Column
	private Long whoIsRequesting;
	@Column
	private Long requestingFor;
	@Column
	private String requesterEmailId;
	@Column
	private String status="PENDING";
	
	public RequestsToAdmin() {}

	/**
	 * @return the requestId
	 */
	public long getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(long requestId) {
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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
