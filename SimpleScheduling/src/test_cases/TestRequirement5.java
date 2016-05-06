package test_cases;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import common.SimpleTools;
import junit.framework.TestCase;
import shceduling_api.*;


/*
 * Test Requirement 5 : Suggest available timeslots for meetings given a group of persons.
 * 
 * Notice: for simplicity, we assume each meeting has exactly one hour,
 * and a meeting can only start at the hour mark
 * 
 * Author : Ming
 */
public class TestRequirement5 extends TestCase {
	
	public void test() throws ParseException {
		
		// create meetings to fill person's schedule
		Meeting meeting1 = new Meeting();
		Date meeting1_Datetime=SimpleTools.parseToDate("2016-04-30 08:00:00");
		meeting1.setStartTime(meeting1_Datetime);
		
		Meeting meeting2 = new Meeting();
		Date meeting2_Datetime=SimpleTools.parseToDate("2016-04-30 09:00:00");
		meeting2.setStartTime(meeting2_Datetime);
		
		Meeting meeting3 = new Meeting();
		Date meeting3_Datetime=SimpleTools.parseToDate("2016-04-30 10:00:00");
		meeting3.setStartTime(meeting3_Datetime);
		
		//create persons
		Person p1=new Person("rose",	"rose@deltek.com");
		Person p2=new Person("robert",	"robert@deltek.com");
		//involve 
		meeting1.addPerson(p1);
		meeting2.addPerson(p1);
		meeting3.addPerson(p1);
		meeting1.addPerson(p2);
		meeting2.addPerson(p2);
		meeting3.addPerson(p2);
		
		p1.acceptEvent(meeting1);
		p1.acceptEvent(meeting2);
		p1.acceptEvent(meeting3);
		p2.acceptEvent(meeting1);
		p2.acceptEvent(meeting2);
		p2.acceptEvent(meeting3);
		
		/*
		 *  create a meeting, and add persons to it
		 *  then get the suggested time slot based on person's schedule
		 *  
		 */
		Meeting myMeeting = new Meeting();
		myMeeting.addPerson(p1);
		myMeeting.addPerson(p2);
		
		ArrayList<Date> suggestedTimeSlots=myMeeting.suggestTimeSlot_in_next_x_days(3);
		
		assertFalse(suggestedTimeSlots.contains(meeting1_Datetime));
		assertFalse(suggestedTimeSlots.contains(meeting2_Datetime));
		assertFalse(suggestedTimeSlots.contains(meeting3_Datetime));

		for(Date date:suggestedTimeSlots){
			System.out.println(date);
		}
		
	}
}
