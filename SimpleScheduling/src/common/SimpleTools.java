package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.*;

public class SimpleTools {

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	private static final DateFormat timeFormat = new SimpleDateFormat("hh:mm");
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// validate email address
	public static boolean validEmail(String email) {

		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

	// parse string to date
	public static Date parseToDate(String date) throws ParseException {
		return dateFormat.parse(date);
	}

	// get hour and minute from date
	public static String parseToHourMinute(Date date) {
		return timeFormat.format(date);
	}

	// add day
	public static Date addDays(Date date, int days) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days); // minus number would decrement the days
		return cal.getTime();
	}

	// set to next round hour
	public static Date getNextRoundHour(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.add(Calendar.HOUR, 1);
		return calendar.getTime();
	}

	// add days
	public static Date addDay(Date date, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, x);
		return calendar.getTime();
	}

	// add hours
	public static Date addHour(Date date, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.HOUR, x);
		return calendar.getTime();
	}

	// get All TimeSlot in next x days
	public static ArrayList<Date> getAllTimeSlot_in_next_x_days(int x) {
		Date today = new Date();
		Date today_plus_x = addDay(today, x);
		Date currentTimeSlot = getNextRoundHour(today);
		ArrayList<Date> allTimeSlots = new ArrayList<>();

		while (currentTimeSlot.before(today_plus_x)) {
			if (isInTimeSlotRang(currentTimeSlot)) {
			    allTimeSlots.add(currentTimeSlot);
				currentTimeSlot = addHour(currentTimeSlot, 1);
			} else {
				// reset to next day's 08:00
				currentTimeSlot = setToNextDayHour(currentTimeSlot, 8);
			}
		}
		return allTimeSlots;
	}

	// check if date time is between 08:00-17:00
	public static boolean isInTimeSlotRang(Date date) {
		Date dateTime_0800 = setRoundHour(date, 8);
		Date dateTime_1700 = setRoundHour(date, 17);
		if ((date.equals(dateTime_0800) || date.equals(dateTime_1700))
				|| date.after(dateTime_0800) && date.before(dateTime_1700)) {
			return true;
		}
		return false;
	}

	// set round hours
	public static Date setRoundHour(Date date, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, x);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

	// plus one day and set hour
	private static Date setToNextDayHour(Date date, int x) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		calendar.set(Calendar.HOUR_OF_DAY, x);
		return calendar.getTime();
	}

}
