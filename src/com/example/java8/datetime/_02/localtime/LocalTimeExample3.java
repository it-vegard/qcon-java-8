package com.example.java8.datetime._02.localtime;

import java.time.LocalTime;

public class LocalTimeExample3 {
	public static void main(String[] args) {

		LocalTime time = LocalTime.of(10, 30);
		System.out.println("time: " + time);

		LocalTime plusNanos = time.plusNanos(1);
		System.out.println("time + 1 nano: " + plusNanos);
		
		LocalTime plusSeconds = time.plusSeconds(1);
		System.out.println("time + 1 second: " + plusSeconds);
		
		LocalTime plusHours = time.plusHours(1);
		System.out.println("time + 1 hour: " + plusHours);
		
		LocalTime plusMinutes = time.plusMinutes(1);
		System.out.println("time + 1 minute: " + plusMinutes);
		
		LocalTime plusHours2 = time.plusHours(25);  
		System.out.println("time + 25 hours: " + plusHours2);

	}
}
