package com.example.java8.datetime._06.period;

import java.time.Period;

public class PeriodExample1 {
	public static void main(String[] args) {
		
		/*
		 * A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
		 * see the java doc for description of a period
		 */
		Period period = Period.ofMonths(9);
		System.out.println(period);
		
		
	}
}
