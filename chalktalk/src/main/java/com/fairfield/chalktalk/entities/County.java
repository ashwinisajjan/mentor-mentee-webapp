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
public class County implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long countyId;
	@Column
	private String county;
	@Column
	private String state;
	
	public County() {}
	/**
	 * @param countyId
	 * @param county
	 * @param state
	 * @param country
	 */
	public County(long countyId, String county, String state) {
		super();
		this.countyId = countyId;
		this.county = county;
		this.state = state;
	}
	
	/**
	 * 
	 * @param county
	 * @param state
	 */
	public County(String county, String state) {
		super();
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
