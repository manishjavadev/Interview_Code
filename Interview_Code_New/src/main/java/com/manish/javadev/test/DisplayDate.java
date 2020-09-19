package com.manish.javadev.test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

/**
 * @author Manish
 *
 */

/**
 * This program is simply taking input from user and displaying a matrix.
 * 
 */
public class DisplayDate {

	public static void main(String[] args) throws ParseException {
		Calendar calStartDate = Calendar.getInstance();
		Calendar calEndDate = Calendar.getInstance();
		// long millis = 1577836800000; Product Start Date
		// 1577836800000///End Dae 1609459199000
		// Local With Out Format 1609372800000
		// ENV With Format 1609459199000
		Long millsStartDate = new Long("1577836800000");
		Long millsEndDate = new Long("1672444800000");

		calStartDate.set(Calendar.HOUR_OF_DAY, 0);
		calStartDate.set(Calendar.MINUTE, 0);
		calStartDate.set(Calendar.SECOND, 0);
		calStartDate.set(Calendar.MILLISECOND, 0);

		calEndDate.setTimeInMillis(millsEndDate);
		calEndDate.set(Calendar.HOUR_OF_DAY, 23);
		calEndDate.set(Calendar.MINUTE, 59);
		calEndDate.set(Calendar.SECOND, 59);
		calEndDate.set(Calendar.MILLISECOND, 999);

		Long millsStartDateNew = calStartDate.getTimeInMillis();
		Long millsEndDateNew = calEndDate.getTimeInMillis();

		Timestamp startDate = new Timestamp(millsStartDateNew);
		Timestamp endDate = new Timestamp(millsEndDateNew);
		System.out.println("Start Date of The Day :: " + startDate);
		System.out.println("End Date of The day :: " + endDate);
	}
}
