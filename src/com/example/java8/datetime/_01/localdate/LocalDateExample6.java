package com.example.java8.datetime._01.localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * How to convert from a java util date to a new jsr 310 date
 * 
 * see  http://stackoverflow.com/a/21242111/438319
 * 
 * @author adib
 *
 */
public class LocalDateExample6 {
	public static void main(String[] args) {

		
		/**
		 * From Java util date to jsr 310 convert the java.util.Date to 
		 * java.time.Instant then convert the Instant to some other java.time. class
		 *
		 */
		
		Date utilDate = new Date();
			
	    System.out.println("Util Date" + utilDate);
	    
		Instant instant = utilDate.toInstant(); // new method in java 8 		
		ZonedDateTime zdt = instant.atZone(ZoneId.systemDefault());
		LocalDate localDate = zdt.toLocalDate();
		
		System.out.println("LocalDate " + localDate);
	
		
		/**
		 * From JSR 301 to util date. convert the java.time class to a java.time.Instance 
		 * then convert the instance to a java.util.Date
		 */
		
		 instant = localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		 Date result = Date.from(instant);
		 System.out.println(result);
	}
}
