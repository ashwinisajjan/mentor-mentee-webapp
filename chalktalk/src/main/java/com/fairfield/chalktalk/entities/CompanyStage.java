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
public class CompanyStage {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String companyStageId;
	@Column
	private String stage;
	@Column
	private String description;
	/**
	 * @param companyStageId
	 * @param stage
	 * @param desc
	 */
	public CompanyStage(String companyStageId, String stage, String desc) {
		super();
		this.companyStageId = companyStageId;
		this.stage = stage;
		this.description = desc;
	}
	/**
	 * @return the companyStageId
	 */
	public String getCompanyStageId() {
		return companyStageId;
	}
	/**
	 * @param companyStageId the companyStageId to set
	 */
	public void setCompanyStageId(String companyStageId) {
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
	 * @return the desc
	 */
	public String getDesc() {
		return description;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.description = desc;
	}
	
}
