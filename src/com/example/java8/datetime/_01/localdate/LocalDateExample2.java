package com.example.java8.datetime._01.localdate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;

public class LocalDateExample2 {
	public static void main(String[] args) {

		System.out.println( LocalDate.of(2014, 02, 22) );
		
		System.out.println( LocalDate.ofYearDay(2014, 300) );
		
		LocalDate date = LocalDate.parse("2014-01-15");
		System.out.println(date);

		try { 
			LocalDate date2 = LocalDate.parse("2014-15-01");
			System.out.println(date2);
		} catch(DateTimeParseException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		try {
			System.out.println(LocalDate.of(2013, Month.FEBRUARY, 29));
		} catch( DateTimeException e) {
			e.printStackTrace();
		}
	}
}
