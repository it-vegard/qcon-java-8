package com.example.java8.datetime._01.localdate;

import java.time.LocalDate;

public class LocalDateExample3 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2014,01,1);
		System.out.println("Start date: " + date);
		
		LocalDate dayAfter = date.plusDays(1);
		System.out.println("Start date + 1: " + dayAfter);
		
		LocalDate weekFromDate = date.plusWeeks(1);
		System.out.println("week from date: " + weekFromDate);
		
		LocalDate weekBeforeDate = date.plusWeeks(-1);
		System.out.println("Week before date: " + weekBeforeDate);
		
		LocalDate yearBeforeDate = date.minusYears(1);
		System.out.println("Year before date: " + yearBeforeDate);
		
		System.out.println("After now: " + date.isAfter(LocalDate.now()));
		System.out.println("Before now:"  + date.isBefore(LocalDate.now()));
		
		System.out.println("Is Year Year: " + date.isLeapYear());
	}
}
