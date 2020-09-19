package com.manish.javadev.test;

import java.util.Calendar;
import java.util.Date;

public class LowestAndHighestTimeOfADayForDate {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		Date startDate = cal.getTime();
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		cal.set(Calendar.MILLISECOND, 999);
		Date endDate = cal.getTime();

		System.out.println("startDate Date " + startDate);
		System.out.println("startDate Date " + endDate);
	}
}
