package com.example.java8.stream._01.source;

import java.util.Arrays;
import java.util.List;

public class StreamSourceExample2 {
	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("toronto","ottawa","montreal","vancouver");
		cities.stream().forEach(System.out::println); // <1>
				
	}
}
