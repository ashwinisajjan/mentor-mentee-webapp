/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Meetings implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long meetingId;
	
	@Column
	private Date timings;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mentorId", referencedColumnName="mentorId")
	private Mentor hostId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "menteeId", referencedColumnName="menteeId")
	private Mentee menteeId;
	
	@JoinColumn(name = "locId", referencedColumnName="locId")
	@OneToOne(cascade = CascadeType.ALL)
	private MeetUpLocation locId;
	
	@Column
	private boolean didMeetingHeld;
	
	public Meetings() {}

	/**
	 * @return the meetingId
	 */
	public long getMeetingId() {
		return meetingId;
	}

	/**
	 * @param meetingId the meetingId to set
	 */
	public void setMeetingId(long meetingId) {
		this.meetingId = meetingId;
	}

	/**
	 * @return the timings
	 */
	public Date getTimings() {
		return timings;
	}

	/**
	 * @param timings the timings to set
	 */
	public void setTimings(Date timings) {
		this.timings = timings;
	}

	/**
	 * @return the didMeetingHeld
	 */
	public boolean isDidMeetingHeld() {
		return didMeetingHeld;
	}

	/**
	 * @param didMeetingHeld the didMeetingHeld to set
	 */
	public void setDidMeetingHeld(boolean didMeetingHeld) {
		this.didMeetingHeld = didMeetingHeld;
	}

	/**
	 * @param meetingId
	 * @param timings
	 * @param didMeetingHeld
	 */
	public Meetings(long meetingId, Date timings, boolean didMeetingHeld) {
		super();
		this.meetingId = meetingId;
		this.timings = timings;
		this.didMeetingHeld = didMeetingHeld;
	}

}
