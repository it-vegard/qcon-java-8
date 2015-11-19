package com.example.java8.datetime._01.localdate;

import java.time.LocalDate;

public class LocalDateExample5 {
	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2014,01,1);
		System.out.println("Start date: " + date);
		
		
		System.out.println("After now: " + date.isAfter(LocalDate.now()));
		System.out.println("Before now:"  + date.isBefore(LocalDate.now()));
		
		LocalDate date2 = LocalDate.of(2014, 01, 01);
		System.out.println("date and date2 the same " + date.equals(date2));
		
		System.out.println("Is Year Year: " + date.isLeapYear());
	}
}
