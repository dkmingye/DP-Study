package shceduling_api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import common.SimpleTools;

public class Schedule {

	private HashMap<Event, Status> events;

	public Schedule() {
		events = new HashMap<Event, Status>();
	}

	public void addEvent(Event event) {
		events.put(event, Status.Accepted);
	}

	public void declineEvent(Event event) {
		events.put(event, Status.Rejected);
	}

	public void deleteEvent(Event event) {
		if (events.containsKey(event)) {
			events.remove(event);
		}
	}
	
	//get upcomming meeting
	public Meeting getUpCommingMeeting(){
		ArrayList<Meeting> allAcceptedMeeting=getAcceptedMeeting();
		Meeting theUpCommingMeeting=null;
		Date nowDate=new Date();
		long nowDateTime=nowDate.getTime();
		for(Meeting meeting:allAcceptedMeeting){
			if(meeting.getStartTime().after(nowDate)){
				if(theUpCommingMeeting==null){
					theUpCommingMeeting=meeting;
				}else{
					long timeDiffer_meeting=meeting.getStartTime().getTime()-nowDateTime;
					long timeDiffer_UPCmeeting=theUpCommingMeeting.getStartTime().getTime()-nowDateTime;
					if(timeDiffer_meeting<timeDiffer_UPCmeeting){
						theUpCommingMeeting=meeting;
					}
				}
			}
		}
		
		return theUpCommingMeeting;
	}

	// get daily events
	public ArrayList<Event> getDailyEvent() {
		ArrayList<Event> dailyEvents = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Accepted && entry.getKey().getRepeat() == Repeat.Daily) {
				dailyEvents.add(entry.getKey());
			}
		}
		return dailyEvents;
	}

	// get weekday events
	public ArrayList<Event> getWeekDayEvent() {
		ArrayList<Event> weekDayEvents = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Accepted && entry.getKey().getRepeat() == Repeat.Weekday) {
				weekDayEvents.add(entry.getKey());
			}
		}
		return weekDayEvents;
	}

	// get one time events
	public ArrayList<Event> getOneTimeEvent() {
		ArrayList<Event> oneTimeEvents = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Accepted && entry.getKey().getRepeat() == Repeat.Onetime) {
				oneTimeEvents.add(entry.getKey());
			}
		}
		return oneTimeEvents;
	}

	// get accepted event
	public ArrayList<Event> getAcceptedEvent() {
		ArrayList<Event> acceptedEvents = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Accepted) {
				acceptedEvents.add(entry.getKey());
			}
		}
		return acceptedEvents;
	}

	// get accepted meeting
	public ArrayList<Meeting> getAcceptedMeeting() {
		ArrayList<Meeting> acceptedMeetings = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Accepted && entry.getKey() instanceof Meeting) {
				acceptedMeetings.add((Meeting) entry.getKey());
			}
		}
		return acceptedMeetings;
	}

	// get declined event
	public ArrayList<Event> getDeclinedEvent() {
		ArrayList<Event> declinedEvents = new ArrayList<>();
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Rejected) {
				declinedEvents.add(entry.getKey());
			}
		}
		return declinedEvents;
	}

	// remove declined events
	public void removeDeclinedEvents() {
		for (HashMap.Entry<Event, Status> entry : events.entrySet()) {
			if (entry.getValue() == Status.Rejected) {
				events.remove(entry.getKey());
			}
		}
	}

	// print daily event
	public void printDailyEvent() {
		ArrayList<Event> dailyEvents = getDailyEvent();
		for (Event event : dailyEvents) {
			System.out.println("Daily Event 	: " + event.getTitle() + " , Start Time : "
					+ SimpleTools.parseToHourMinute(event.getStartTime()) + " , End Time : "
					+ SimpleTools.parseToHourMinute(event.getEndTime()));
		}
	}

	// print one Time event
	public void printOneTimeEvent() {
		ArrayList<Event> oneTimeEvents = getOneTimeEvent();
		for (Event event : oneTimeEvents) {
			System.out.println("One Time Event 	: " + event.getTitle() + " , Start Time : " + event.getStartTime()
					+ " , End Time : " + event.getEndTime());

		}
	}

	// print weekday event
	public void printWeekDayEvent() {
		ArrayList<Event> weekDayEvents = getWeekDayEvent();
		for (Event event : weekDayEvents) {
			System.out.println("Week Event 	: " + event.getTitle() + " , Start Time : "
					+ SimpleTools.parseToHourMinute(event.getStartTime()) + " , End Time : "
					+ SimpleTools.parseToHourMinute(event.getEndTime()));
		}
	}

	// get all accepted meeting for next x days, and collect their time
	public ArrayList<Date> getMeetingsTime_Next_x_Days(int days) {
		ArrayList<Date> meetingTimes = new ArrayList<>();
		Date nowDate = new Date();
		Date nowDate_plus_x = SimpleTools.addDays(nowDate, days);
		ArrayList<Meeting> acceptedMeeting = getAcceptedMeeting();
		for (Meeting meeting : acceptedMeeting) {
			Date mTime = meeting.getStartTime();
			if (mTime.after(nowDate) && mTime.before(nowDate_plus_x)) {
				meetingTimes.add(mTime);
			}
		}
		return meetingTimes;
	}

	// clear events map
	public void clear() {
		events.clear();
	}
}
