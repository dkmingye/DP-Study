package shceduling_api;

import common.SSConstants;
import common.SimpleTools;

public class Person {

	private String name;
	private String email;
	private Schedule schedule;

	public Person(String name, String email) {
		if (SimpleTools.validEmail(email)) {
			this.name = name;
			this.email = email;
			schedule = new Schedule();
		} else {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_INVALID_EMAIL);
		}
	}

	public void acceptEvent(Event event) {
		schedule.addEvent(event);
	}

	public void declineEvent(Event event) {
		schedule.declineEvent(event);
	}
	
	public void deleteEvent(Event event){
		schedule.addEvent(event);
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSchedule(Schedule schedule){
		this.schedule=schedule;
	}

	public void setEmail(String email) {
		if (SimpleTools.validEmail(email)) {
			this.email = email;
		} else {
			throw new RuntimeException(SSConstants.EXCEPTION_MSG_INVALID_EMAIL);
		}
	}

	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return this.email;
	}
	
	public Schedule getSchedule(){
		return this.schedule;
	}
}
