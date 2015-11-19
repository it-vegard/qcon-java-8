package com.example.java8.datetime._04.instant;

import java.time.Instant;

public class InstantExample1 {
	public static void main(String[] args) {
		
		/** 
		 * Instances are different than local date time in that local date time
		 * keeps separate fields for the different parts of the date time such as 
		 * the year, the month ... tec. but instance is just the number of 
		 * nano seconds since jan 1 1970.
		 * 
		 */
		Instant instant = Instant.now();
		System.out.println(instant);
		
		
	}
}
