package test_cases;

import java.text.ParseException;
import common.SimpleTools;
import junit.framework.TestCase;
import shceduling_api.Meeting;
import shceduling_api.Person;

/*
 * Test Requirement :  the upcoming meetings for person
 * 
 * Author : Ming
 */
public class TestRequirementExtra extends TestCase {

	public void test() throws ParseException {

		// create meetings to fill person's schedule
		Meeting meeting1 = new Meeting();
		meeting1.setStartTime(SimpleTools.parseToDate("2016-04-27 08:00:00"));

		Meeting meeting2 = new Meeting();
		meeting2.setStartTime(SimpleTools.parseToDate("2016-04-30 09:00:00"));

		Meeting meeting3 = new Meeting();
		meeting3.setStartTime(SimpleTools.parseToDate("2016-04-30 10:00:00"));
		
		Meeting meeting4 = new Meeting();
		meeting4.setStartTime(SimpleTools.parseToDate("2016-05-11 10:00:00"));

		// create persons
		Person p1 = new Person("bob", "bob@deltek.com");

		p1.acceptEvent(meeting2);
		p1.acceptEvent(meeting3);
		p1.acceptEvent(meeting1);
		p1.acceptEvent(meeting4);
		
		//get upcomming meeting
		Meeting UPCmeeting=p1.getSchedule().getUpCommingMeeting();
		
		System.out.println(UPCmeeting.getStartTime());

	}
}
