package com.example.java8.datetime._03.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample1 {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		int year = dateTime.getYear();
		System.out.println("Year: " + year);

		Month month = dateTime.getMonth();
		System.out.println("Month: " + month);

		int dayOfMonth = dateTime.getDayOfMonth();
		System.out.println("Day of Month: " + dayOfMonth);

		int dayOfYear = dateTime.getDayOfYear();
		System.out.println("Day of the year: " + dayOfYear);

		DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
		System.out.println("Day of the Week: " + dayOfWeek);
		
		// Era era = dateTime.getEra();  does not exist
		// System.out.println("Era " + era);
		
		System.out.println("hour: " + dateTime.getHour());
		System.out.println("minute: " + dateTime.getMinute());
		System.out.println("Second: " + dateTime.getSecond());
		System.out.println("nano: " + dateTime.getNano());
		
	}
}
