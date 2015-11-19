package com.example.java8.datetime._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample4 {
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.of(2014, 02, 22, 11,30,25,111);
		System.out.println("dateTime: " + dateTime);
		
		System.out.println("before now " + dateTime.isBefore(LocalDateTime.now()));
		System.out.println("after now " + dateTime.isAfter(LocalDateTime.now()));
		
		LocalDateTime dateTime2 = LocalDateTime.of(2014, 02, 22, 11,30,25,111);
		System.out.println("dateTime == dateTime2 " + dateTime.equals(dateTime2));
	}
}
