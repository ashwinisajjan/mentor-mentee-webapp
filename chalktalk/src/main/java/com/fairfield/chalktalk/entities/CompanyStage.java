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
public class CompanyStage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long companyStageId;
	@Column
	private String stage;
	@Column(name = "`order`") 
	private int order;
	
	public CompanyStage() {}
	/**
	 * @param companyStageId
	 * @param stage
	 * @param order
	 */
	public CompanyStage(long companyStageId, String stage, int order) {
		super();
		this.companyStageId = companyStageId;
		this.stage = stage;
		this.order = order;
	}
	
	/**
	 * 
	 * @param stage
	 * @param order
	 */
	public CompanyStage(String stage, int order) {
		super();
		this.stage = stage;
		this.order = order;
	}
	/**
	 * @return the companyStageId
	 */
	public long getCompanyStageId() {
		return companyStageId;
	}
	/**
	 * @param companyStageId the companyStageId to set
	 */
	public void setCompanyStageId(long companyStageId) {
		this.companyStageId = companyStageId;
	}
	/**
	 * @return the stage
	 */
	public String getStage() {
		return stage;
	}
	/**
	 * @param stage the stage to set
	 */
	public void setStage(String stage) {
		this.stage = stage;
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
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
