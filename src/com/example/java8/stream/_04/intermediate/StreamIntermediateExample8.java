package com.example.java8.stream._04.intermediate;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediateExample8 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(7, 1, 2, 3, 4, 5, 5);  // <1>
		
		integers.stream().sorted()  // <1>
						 .forEach(System.out::println); 
	}
}
