package com.example.java8.datetime._01.localdate;

import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.TemporalAdjusters.next;

import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample4 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2014,02,22);
		System.out.println("Start date: " + date);
		
		// obtain an adjuster
		TemporalAdjuster adjuster = TemporalAdjusters.firstDayOfMonth();
		
		// use the adjuster by passing it a temporal object
		Temporal adjusted = adjuster.adjustInto(date);
		if(adjusted instanceof LocalDate) {
			System.out.println("first day of month is " +  adjusted);
		}
		
		// a better way to use the adjuster 
		LocalDate adjustedDate = date.with(adjuster);
		System.out.println(adjustedDate);
		
		// using static imports you can write more compact code 
		LocalDate nextMonday = date.with(next(MONDAY));
		System.out.println("Next Moday " + nextMonday);
		
		
	}
}
