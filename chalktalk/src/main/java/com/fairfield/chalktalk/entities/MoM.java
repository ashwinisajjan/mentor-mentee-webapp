/**
 * 
 */
package com.fairfield.chalktalk.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Ashwini Sajjan
 *
 */
@Entity
@Table
public class MoM {

	@Id
	@GeneratedValue
	private String id;
	@JoinColumn(name = "meetingId")
	@OneToOne(cascade=CascadeType.ALL)
	private Meetings meetingId;
	@Column
	private String meetingAttendence;
	@Column
	private String agenda;
	@Column
	private String summary;
	/**
	 * @param id
	 * @param meetingId
	 * @param meetingAttendence
	 * @param agenda
	 * @param summary
	 */
	public MoM(String id, Meetings meetingId, String meetingAttendence, String agenda, String summary) {
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
	 * @return the meetingId
	 */
	public Meetings getMeetingId() {
		return meetingId;
	}
	/**
	 * @param meetingId the meetingId to set
	 */
	public void setMeetingId(Meetings meetingId) {
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
