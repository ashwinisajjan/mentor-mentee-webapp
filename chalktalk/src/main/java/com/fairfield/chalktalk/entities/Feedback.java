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
public class Feedback implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long feedbackId;
	@Column
	private String givenTo;
	@Column	
	private String feedback;
	@Column
	private int rating;
	
	public Feedback() {}
	/**
	 * @param id
	 * @param givenTo
	 * @param feedback
	 * @param rating
	 */
	public Feedback(long id, String givenTo, String feedback, int rating) {
		super();
		this.feedbackId = id;
		this.givenTo = givenTo;
		this.feedback = feedback;
		this.rating = rating;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return feedbackId;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.feedbackId = id;
	}
	/**
	 * @return the givenTo
	 */
	public String getGivenTo() {
		return givenTo;
	}
	/**
	 * @param givenTo the givenTo to set
	 */
	public void setGivenTo(String givenTo) {
		this.givenTo = givenTo;
	}
	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}
	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
