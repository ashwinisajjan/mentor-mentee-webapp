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
public class MentorSpecialization implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	private String aPSIndustry;
	@Column
	private String specialization;
	@Column(name = "`order`") 
	private int order;
	
	public MentorSpecialization() {}

	/**
	 * @param id
	 * @param aPSIndustry
	 * @param specialization
	 * @param order
	 */
	public MentorSpecialization(long id, String aPSIndustry, String specialization, int order) {
		super();
		this.id = id;
		this.aPSIndustry = aPSIndustry;
		this.specialization = specialization;
		this.order = order;
	}
	
	/**
	 * 
	 * @param aPSIndustry
	 * @param specialization
	 * @param order
	 */
	public MentorSpecialization(String aPSIndustry, String specialization, int order) {
		super();
		this.aPSIndustry = aPSIndustry;
		this.specialization = specialization;
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
	 * @return the aPSIndustry
	 */
	public String getaPSIndustry() {
		return aPSIndustry;
	}

	/**
	 * @param aPSIndustry the aPSIndustry to set
	 */
	public void setaPSIndustry(String aPSIndustry) {
		this.aPSIndustry = aPSIndustry;
	}

	/**
	 * @return the specialization
	 */
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * @param specialization the specialization to set
	 */
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
