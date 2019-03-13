/**
 * 
 */
package com.fairfield.chalktalk.entities;

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
public class County {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String countyId;
	@Column
	private String county;
	@Column
	private String state;
	@Column
	private String country;
	/**
	 * @param countyId
	 * @param county
	 * @param state
	 * @param country
	 */
	public County(String countyId, String county, String state, String country) {
		super();
		this.countyId = countyId;
		this.county = county;
		this.state = state;
		this.country = country;
	}
	/**
	 * @return the countyId
	 */
	public String getCountyId() {
		return countyId;
	}
	/**
	 * @param countyId the countyId to set
	 */
	public void setCountyId(String countyId) {
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
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
}
