package com.example.java8.datetime._02.localtime;

import java.time.LocalTime;

public class LocalTimeExample2 {
	public static void main(String[] args) {
		
		System.out.println(LocalTime.of(10,30));
		System.out.println(LocalTime.of(10,30,59));
		System.out.println(LocalTime.of(10,30,59,8787));
		
		System.out.println("Midnight " + LocalTime.MIDNIGHT);
		System.out.println("Min Time " + LocalTime.MIN);
		System.out.println("Max Time " + LocalTime.MAX);
		
	}
}
