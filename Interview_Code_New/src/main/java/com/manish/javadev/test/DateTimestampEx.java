package com.manish.javadev.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class DateTimestampEx {
	public static void main(String[] args) throws ParseException {
		DateTimestampEx obj = new DateTimestampEx();
		Calendar calStartDate = Calendar.getInstance();
		Calendar calEndDate = Calendar.getInstance();
		List list = new ArrayList<>();
		System.out.println(list);
		obj.test();
		// long millis = 1577836800000; Product Start Date
		// 1577836800000///End Dae 1609459199000
		// Local With Out Format 1609372800000
		// ENV With Format 1609459199000
		Long millsStartDate = new Long("1588291200000");
		Long millsEndDate = new Long(Long.MAX_VALUE);

		/*
		 * calStartDate.set(Calendar.HOUR_OF_DAY, 0); calStartDate.set(Calendar.MINUTE,
		 * 0); calStartDate.set(Calendar.SECOND, 0);
		 * calStartDate.set(Calendar.MILLISECOND, 0);
		 * 
		 * calEndDate.setTimeInMillis(millsEndDate);
		 * calEndDate.set(Calendar.HOUR_OF_DAY, 23); calEndDate.set(Calendar.MINUTE,
		 * 59); calEndDate.set(Calendar.SECOND, 59);
		 * calEndDate.set(Calendar.MILLISECOND, 999);
		 * 
		 * Long millsStartDateNew = calStartDate.getTimeInMillis(); Long millsEndDateNew
		 * = calEndDate.getTimeInMillis();
		 */
		Timestamp startDate = new Timestamp(millsStartDate);
		Timestamp endDate = new Timestamp(millsEndDate);
		System.out.println("Start Date " + startDate);
		System.out.println("End Date " + endDate);
		String str = null;

		if (2 > 1 || str.equals("2")) {
			System.out.println("Done");
		}
	}

	private void test() {
		System.out.println(this.getClass().getCanonicalName());
		DateTimestampEx DateTimestampEx =null;

	}
}
