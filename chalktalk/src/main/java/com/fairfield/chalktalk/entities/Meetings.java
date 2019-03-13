/**
 * 
 */
package com.fairfield.chalktalk.entities;

import java.sql.Date;

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
public class Meetings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String meetingId;
	
	@Column
	private Date timings;
	
	/*@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "mentorId")
	private Mentor host;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "menteeId")
	private Mentee attendese;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "locId")
	private MeetUpLocation location;*/
	
	@Column
	private boolean didMeetingHeld;

	/**
	 * @return the meetingId
	 */
	public String getMeetingId() {
		return meetingId;
	}

	/**
	 * @param meetingId the meetingId to set
	 */
	public void setMeetingId(String meetingId) {
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
	public Meetings(String meetingId, Date timings, boolean didMeetingHeld) {
		super();
		this.meetingId = meetingId;
		this.timings = timings;
		this.didMeetingHeld = didMeetingHeld;
	}

}
