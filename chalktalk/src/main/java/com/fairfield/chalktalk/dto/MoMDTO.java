/**
 * 
 */
package com.fairfield.chalktalk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class MoMDTO {

	private @JsonProperty("id") long id;
	private @JsonProperty("meetingId") MeetingsDTO meetingId;
	private @JsonProperty("meetingAttendence") String meetingAttendence;
	private @JsonProperty("agenda") String agenda;
	private @JsonProperty("summary") String summary;
	
	public MoMDTO() {}
	/**
	 * @param id
	 * @param meetingId
	 * @param meetingAttendence
	 * @param agenda
	 * @param summary
	 */
	public MoMDTO(long id, MeetingsDTO meetingId, String meetingAttendence, String agenda, String summary) {
		super();
		this.id = id;
		this.meetingId = meetingId;
		this.meetingAttendence = meetingAttendence;
		this.agenda = agenda;
		this.summary = summary;
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
	 * @return the meetingId
	 */
	public MeetingsDTO getMeetingId() {
		return meetingId;
	}
	/**
	 * @param meetingId the meetingId to set
	 */
	public void setMeetingId(MeetingsDTO meetingId) {
		this.meetingId = meetingId;
	}
	/**
	 * @return the meetingAttendence
	 */
	public String getMeetingAttendence() {
		return meetingAttendence;
	}
	/**
	 * @param meetingAttendence the meetingAttendence to set
	 */
	public void setMeetingAttendence(String meetingAttendence) {
		this.meetingAttendence = meetingAttendence;
	}
	/**
	 * @return the agenda
	 */
	public String getAgenda() {
		return agenda;
	}
	/**
	 * @param agenda the agenda to set
	 */
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	/**
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
