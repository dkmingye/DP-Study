package shceduling_api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import common.SSConstants;
import common.SimpleTools;

public class Meeting extends Event {

	private HashMap<Person, Status> meetingGroup;

	public Meeting() {
		super();
		meetingGroup = new HashMap<Person, Status>();
	}

	public Meeting(String note, String title, String location, Date startTime, Date endTime, Repeat repeat) {
		super(note, title, location, startTime, endTime, repeat);
	}

	public void addPerson(Person person) {
		meetingGroup.put(person, Status.Pending);
	}

	public void removePerson(Person person) {
		meetingGroup.remove(person);
	}

	public void changePersonStatus(Person person, Status status) {
		if (meetingGroup.containsKey(person)) {
			meetingGroup.replace(person, status);
		} else {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_NO_SUCH_PERSON);
		}
	}

	// get all persons
	public ArrayList<Person> getAllPersons() {
		ArrayList<Person> allPersons = new ArrayList<>();
		allPersons.addAll(meetingGroup.keySet());
		return allPersons;
	}

	// get persons that has accepted this meeting
	public ArrayList<Person> getAcceptedGroup() {
		ArrayList<Person> acceptedGroup = new ArrayList<>();
		for (HashMap.Entry<Person, Status> entry : meetingGroup.entrySet()) {
			if (entry.getValue() == Status.Accepted) {
				acceptedGroup.add(entry.getKey());
			}
		}
		return acceptedGroup;
	}

	// get persons that has declined this meeting
	public ArrayList<Person> getDeclinedGroup() {
		ArrayList<Person> acceptedGroup = new ArrayList<>();
		for (HashMap.Entry<Person, Status> entry : meetingGroup.entrySet()) {
			if (entry.getValue() == Status.Rejected) {
				acceptedGroup.add(entry.getKey());
			}
		}
		return acceptedGroup;
	}

	/*
	 * suggest a time slot for the meeting group it will search available time
	 * within next x days
	 * 
	 * Each meeting has exactly one hour,and a meeting can only start at the
	 * hour mark, so we only consider the start time of a meeting
	 * 
	 * the method return a datetime, which means the suggested time slot would
	 * be (datetime, datetime + 1 hour)
	 * 
	 * Logic: search area within a day is 08:00 - 17:00 since it is hour mark,
	 * so each day has 9 slots of meeting time e.g. 08:00-09:00, 09:00-10:00,
	 * ... ... we will check each time slot's availability against to all
	 * persons' schedule, if the time slot fit, it will be added into suggested
	 * list
	 * 
	 * Author: Ming
	 */
	public ArrayList<Date> suggestTimeSlot_in_next_x_days(int x) {

		if (x < 0) {
			return null;
		}

		ArrayList<Date> suggestTimeSlot = new ArrayList<>();
		// get all time slots in next x days
		ArrayList<Date> allTimeSlots_in_next_x_days = SimpleTools.getAllTimeSlot_in_next_x_days(x);
		// get all meeting times of persons who involved in this meeting
		ArrayList<Date> allPersonMeetingTimes = new ArrayList<>();
		for (Person person : getAllPersons()) {
			allPersonMeetingTimes.addAll(person.getSchedule().getMeetingsTime_Next_x_Days(x));
		}

		if (allPersonMeetingTimes.isEmpty()) {// if everyone's schedule is free in next x days
			suggestTimeSlot = allTimeSlots_in_next_x_days;
		} else {

			// for each time slots, check its availability against all persons'schedule
			for (Date timeSlot : allTimeSlots_in_next_x_days) {
				int count = 0;
				for (Date personMeetingTime : allPersonMeetingTimes) {
					count++;
					Date personMeetingTime_plus_1_hour = SimpleTools.addHour(personMeetingTime, 1);
					// check the time slot that should not between any person's meeting time
					if ((timeSlot.after(personMeetingTime) && timeSlot.before(personMeetingTime_plus_1_hour))
							|| timeSlot.equals(personMeetingTime) || timeSlot.equals(personMeetingTime_plus_1_hour)) {
						break;
					}
					if (count == allPersonMeetingTimes.size()) {
						suggestTimeSlot.add(timeSlot);
					}
				}
			}
		}
		return suggestTimeSlot;
	}
}
