package com.example.java8.datetime._02.localtime;

import java.time.LocalTime;

public class LocalTimeExample4 {
	public static void main(String[] args) {

		LocalTime time = LocalTime.of(10, 30);
		System.out.println("time: " + time);

		System.out.println("After now: " + time.isAfter(LocalTime.now()));
		System.out.println("Before now: " + time.isBefore(LocalTime.now()));
		
		LocalTime time2 = LocalTime.of(10,30);
		System.out.println("time is same as time2 " + time.equals(time2));

	}
}
