package shceduling_api;

import java.util.Date;

import common.SSConstants;

public class Event {
	private String note;
	private String title;
	private String location;
	private Date startTime;
	private Date endTime;
	private Repeat repeat;

	public Event() {
		note = "";
		title = "";
		location = "";
		repeat = Repeat.Onetime;
	}

	public Event(String note, String title, String location, Date startTime, Date endTime, Repeat repeat) {
		this.note=note;
		this.title=title;
		this.location=location;
		this.startTime=startTime;
		this.endTime=endTime;
		this.repeat=repeat;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setNote(String note) {
		this.note = note;

	}

	public void setLocation(String location) {
		this.location = location;

	}

	public void setStartTime(Date startTime) {
		if (this.endTime == null || startTime.before(this.endTime)) {
			this.startTime = startTime;
		} else {		
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_STARTTIME_EQUALS_OR_AFTER);
			
		}

	}

	public void setEndTime(Date endTime) {
		if (this.startTime == null) {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_STARTTIME_NOT_SET);
		} else if (endTime.before(this.startTime) || endTime.equals(this.startTime)) {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_ENDTIME_EQUALS_OR_BEFORE);
		} else {
			this.endTime = endTime;
		}

	}

	public void setRepeat(Repeat repeat) {
		this.repeat = repeat;

	}

	public String getTitle() {
		return title;
	}

	public String getNote() {
		return note;
	}

	public String getLocation() {
		return location;
	}

	public Date getStartTime() {
		if (startTime == null) {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_STARTTIME_NOT_SET);
		}
		return startTime;
	}

	public Date getEndTime() {
		if (endTime == null) {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_ENDTIME_NOT_SET);
		}
		return endTime;
	}

	public Repeat getRepeat() {
		return repeat;
	}

}
