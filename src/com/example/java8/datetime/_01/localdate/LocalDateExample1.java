package com.example.java8.datetime._01.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.Era;

/**
 * Read the overview at http://docs.oracle.com/javase/tutorial/datetime/iso/overview.html
 *
 */
public class LocalDateExample1 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		int year = date.getYear();
		System.out.println("Year: " + year);

		Month month = date.getMonth();
		System.out.println("Month: " + month);

		int dayOfMonth = date.getDayOfMonth();
		System.out.println("Day of Month: " + dayOfMonth);

		int dayOfYear = date.getDayOfYear();
		System.out.println("Day of the year: " + dayOfYear);

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("Day of the Week: " + dayOfWeek);
		
		Era era = date.getEra();
		System.out.println("Era " + era);
	}
}
