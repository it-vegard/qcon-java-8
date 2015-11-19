package com.example.java8.datetime._02.localtime;

import java.time.LocalTime;

public class LocalTimeExample1 {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println("hour: " + time.getHour());
		System.out.println("minute: " + time.getMinute());
		System.out.println("Second: " + time.getSecond());
		System.out.println("nano: " + time.getNano());

		
	}
}
