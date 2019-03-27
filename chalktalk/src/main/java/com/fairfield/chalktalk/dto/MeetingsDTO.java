/**
 * 
 */
package com.fairfield.chalktalk.dto;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Ashwini Sajjan
 *
 */
@JsonInclude(Include.NON_NULL)
public class MeetingsDTO {
	
	private @JsonProperty("meetingId") long meetingId;
	private @JsonProperty("timings") Date timings;
	private @JsonProperty("hostId") MentorDTO hostId;
	private @JsonProperty("menteeId") MenteeDTO menteeId;
	private @JsonProperty("locId") MeetUpLocationDTO locId;
	private @JsonProperty("didMeetingHeld") boolean didMeetingHeld;
	
	public MeetingsDTO() {}
	/**
	 * @param meetingId
	 * @param timings
	 * @param hostId
	 * @param menteeId
	 * @param locId
	 * @param didMeetingHeld
	 */
	public MeetingsDTO(long meetingId, Date timings, MentorDTO hostId, MenteeDTO menteeId, MeetUpLocationDTO locId,
			boolean didMeetingHeld) {
		super();
		this.meetingId = meetingId;
		this.timings = timings;
		this.hostId = hostId;
		this.menteeId = menteeId;
		this.locId = locId;
		this.didMeetingHeld = didMeetingHeld;
	}
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
	 * @return the hostId
	 */
	public MentorDTO getHostId() {
		return hostId;
	}
	/**
	 * @param hostId the hostId to set
	 */
	public void setHostId(MentorDTO hostId) {
		this.hostId = hostId;
	}
	/**
	 * @return the menteeId
	 */
	public MenteeDTO getMenteeId() {
		return menteeId;
	}
	/**
	 * @param menteeId the menteeId to set
	 */
	public void setMenteeId(MenteeDTO menteeId) {
		this.menteeId = menteeId;
	}
	/**
	 * @return the locId
	 */
	public MeetUpLocationDTO getLocId() {
		return locId;
	}
	/**
	 * @param locId the locId to set
	 */
	public void setLocId(MeetUpLocationDTO locId) {
		this.locId = locId;
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
}
