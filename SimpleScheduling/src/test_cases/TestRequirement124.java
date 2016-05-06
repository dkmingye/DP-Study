package test_cases;

import java.text.ParseException;
import common.SimpleTools;
import junit.framework.TestCase;
import shceduling_api.*;

/*
 * Test Requirement 1 : Add/remove named persons 
 * Test Requirement 2 : Schedule meetings involving one or more persons.
 * Test Requirement 4 : Test Person can accept and decline meeting
 * 
 * Author : Ming
 */
public class TestRequirement124 extends TestCase {

	public void test() throws ParseException {
		
		//create meeting
		Meeting myMeeting = new Meeting();
		myMeeting.setStartTime(SimpleTools.parseToDate("2016-08-31 10:00:00"));
		myMeeting.setEndTime(SimpleTools.parseToDate("2016-08-31 11:00:00"));
		myMeeting.setTitle("Project Status Meeting");
		myMeeting.setRepeat(Repeat.Daily);
		
		//create persons
		Person p1=new Person("jack",	"jack@deltek.com");
		Person p2=new Person("henrik",	"henrik@deltek.com");
		Person p3=new Person("anders",	"anders@deltek.com");
		
		//test: involve persons into meeting
		myMeeting.addPerson(p1);
		myMeeting.addPerson(p2);
		myMeeting.addPerson(p3);
		
		assertTrue(myMeeting.getAllPersons().contains(p1));
		assertTrue(myMeeting.getAllPersons().contains(p2));
		assertTrue(myMeeting.getAllPersons().contains(p3));
		
		//test: persons can accept/decline
		p1.acceptEvent(myMeeting);
		p2.acceptEvent(myMeeting);
		p3.declineEvent(myMeeting);
		
		myMeeting.changePersonStatus(p1, Status.Accepted);
		myMeeting.changePersonStatus(p2, Status.Accepted);
		myMeeting.changePersonStatus(p3, Status.Rejected);
		
		assertTrue(myMeeting.getAcceptedGroup().contains(p1));
		assertTrue(myMeeting.getAcceptedGroup().contains(p2));
		assertTrue(myMeeting.getDeclinedGroup().contains(p3));
		
		assertFalse(myMeeting.getDeclinedGroup().contains(p1));
		assertFalse(myMeeting.getDeclinedGroup().contains(p2));
		assertFalse(myMeeting.getAcceptedGroup().contains(p3));
		
		// test to remove a person
		assertTrue(myMeeting.getAllPersons().contains(p3));
		myMeeting.removePerson(p3);
		assertFalse(myMeeting.getAllPersons().contains(p3));
		assertFalse(myMeeting.getDeclinedGroup().contains(p3));
		
		
	}

}
