package test_cases;

import java.text.ParseException;
import common.SimpleTools;
import junit.framework.TestCase;
import shceduling_api.*;

/*
 * Test Requirement 3 : Represent both individual and recurring meetings.
 * 
 * Author : Ming
 */
public class TestRequirement3 extends TestCase {
	
	public void test() throws ParseException {
		
		// create meeting
		Meeting meeting1 = new Meeting();
		meeting1.setStartTime(SimpleTools.parseToDate("2016-06-28 10:00:00"));
		meeting1.setEndTime(SimpleTools.parseToDate("2016-06-28 11:00:00"));
		meeting1.setTitle("Daily Project Status Meeting");
		meeting1.setRepeat(Repeat.Daily);
		
		Meeting meeting2 = new Meeting();
		meeting2.setStartTime(SimpleTools.parseToDate("2016-06-29 08:00:00"));
		meeting2.setEndTime(SimpleTools.parseToDate("2016-06-29 10:00:00"));
		meeting2.setTitle("Project Kick Off");
		meeting2.setRepeat(Repeat.Onetime);
		
		Meeting meeting3 = new Meeting();
		meeting3.setStartTime(SimpleTools.parseToDate("2016-06-30 10:00:00"));
		meeting3.setEndTime(SimpleTools.parseToDate("2016-06-30 11:00:00"));
		meeting3.setTitle("Fixing Flaws");
		meeting3.setRepeat(Repeat.Weekday);
		
		//create persons
		Person p1=new Person("rose",	"rose@deltek.com");
		
		//involve p1
		meeting1.addPerson(p1);
		meeting2.addPerson(p1);
		meeting3.addPerson(p1);
		
		p1.acceptEvent(meeting1);
		p1.acceptEvent(meeting2);
		p1.acceptEvent(meeting3);
		
		//test : recurring
		assertTrue(p1.getSchedule().getDailyEvent().contains(meeting1));
		assertTrue(p1.getSchedule().getOneTimeEvent().contains(meeting2));
		assertTrue(p1.getSchedule().getWeekDayEvent().contains(meeting3));
		p1.getSchedule().printDailyEvent();
		p1.getSchedule().printOneTimeEvent();
		p1.getSchedule().printWeekDayEvent();
		
	}
}
