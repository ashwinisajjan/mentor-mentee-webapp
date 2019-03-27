/**
 * 
 */
package com.fairfield.chalktalk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class FeedbackDTO {

	private @JsonProperty("feedbackId") long feedbackId;
	private @JsonProperty("givenTo") String givenTo;
	private @JsonProperty("feedback") String feedback;
	private @JsonProperty("rating") int rating;
	
	public FeedbackDTO() {}
	/**
	 * @param feedbackId
	 * @param givenTo
	 * @param feedback
	 * @param rating
	 */
	public FeedbackDTO(long feedbackId, String givenTo, String feedback, int rating) {
		super();
		this.feedbackId = feedbackId;
		this.givenTo = givenTo;
		this.feedback = feedback;
		this.rating = rating;
	}
	/**
	 * @return the feedbackId
	 */
	public long getFeedbackId() {
		return feedbackId;
	}
	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
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
