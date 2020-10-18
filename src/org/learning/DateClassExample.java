package org.learning;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClassExample {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyyhh:mm:ss");
		String time = sdf.format(d).replace(":", "_");
		System.out.println(time);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.FEBRUARY);




	}

}
