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
public class IndustryCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String id;
	@Column
	private String industryCategory;
	@Column(name = "`order`") 
	private int order;
	/**
	 * @param id
	 * @param industryCategory
	 * @param order
	 */
	public IndustryCategory(String id, String industryCategory, int order) {
		super();
		this.id = id;
		this.industryCategory = industryCategory;
		this.order = order;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the industryCategory
	 */
	public String getIndustryCategory() {
		return industryCategory;
	}
	/**
	 * @param industryCategory the industryCategory to set
	 */
	public void setIndustryCategory(String industryCategory) {
		this.industryCategory = industryCategory;
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
