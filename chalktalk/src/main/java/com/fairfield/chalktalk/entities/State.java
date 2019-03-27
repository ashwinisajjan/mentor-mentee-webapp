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
@Table(name = "states")
public class State implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long stateId;
	@Column
	private String state;
	
	public State() {}
	/**
	 * @param stateId
	 * @param state
	 * @param country
	 */
	public State(long stateId, String state) {
		super();
		this.stateId = stateId;
		this.state = state;
	}
	
	/**
	 * 
	 * @param state
	 * @param country
	 */
	public State(String state) {
		super();
		this.state = state;
	}
	/**
	 * @return the stateId
	 */
	public long getStateId() {
		return stateId;
	}
	/**
	 * @param stateId the stateId to set
	 */
	public void setStateId(long stateId) {
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
}
