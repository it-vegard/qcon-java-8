package com.example.java8.datetime._05.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationExample1 {
	public static void main(String[] args) {
		
		/** 
		 * Duration represents a interval of times as number of seconds or nano seconds.
		 */
		
		Duration duration = Duration.between(LocalTime.now(), LocalTime.now().minusHours(1));
		System.out.println(duration);
		
		duration = Duration.ofDays(3);
		System.out.println(duration);
		
		duration = Duration.ofMinutes(25);
		System.out.println(duration);
		
		duration = duration.multipliedBy(5);
		System.out.println(duration);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.plus(duration));
		
	}
}
