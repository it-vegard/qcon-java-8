package com.example.java8.datetime._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample3 {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Next year: " + now.plusYears(1));
		System.out.println("Next 1000 Hour: " + now.plusHours(1000));
		
	}
}
