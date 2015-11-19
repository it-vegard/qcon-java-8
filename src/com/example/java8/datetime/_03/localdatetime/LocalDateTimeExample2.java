package com.example.java8.datetime._03.localdatetime;

import java.time.LocalDateTime;

public class LocalDateTimeExample2 {
	public static void main(String[] args) {
				
		System.out.println(LocalDateTime.of(2014, 02, 22, 11,30,25,111));
	
		System.out.println(LocalDateTime.parse("2013-02-22T11:30:25.444"));
	}
}
