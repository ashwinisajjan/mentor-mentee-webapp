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
public class State {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String stateId;
	@Column
	private String state;
	@Column
	private String country;
	/**
	 * @param stateId
	 * @param state
	 * @param country
	 */
	public State(String stateId, String state, String country) {
		super();
		this.stateId = stateId;
		this.state = state;
		this.country = country;
	}
	/**
	 * @return the stateId
	 */
	public String getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(String stateId) {
		this.stateId = stateId;
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
