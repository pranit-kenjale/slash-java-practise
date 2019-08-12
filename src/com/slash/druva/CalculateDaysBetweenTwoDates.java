package com.slash.druva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Druva Question - Calculate the days between two dates
 * 
 * @author Slash
 * 
 * @see https://beginnersbook.com/2017/10/java-8-calculate-days-between-two-dates/
 *
 */
public class CalculateDaysBetweenTwoDates {

	public static void main(String[] args) {

		String dateBeforeString = "2017-05-24";
		String dateAfterString = "2017-07-29";
			
		//Parsing the date
		//LocalDate dateBefore = LocalDate.parse(dateBeforeString);
		//LocalDate dateAfter = LocalDate.parse(dateAfterString);
		
		LocalDate dateBefore = LocalDate.of(1990, 11, 20);
		LocalDate dateAfter = LocalDate.of(2019, 11, 20);

		// Current Date
		//LocalDate dateAfter = LocalDate.now();
			
		//calculating number of days in between
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
			
		//displaying the number of days
		System.out.println(noOfDaysBetween);
	}

}
