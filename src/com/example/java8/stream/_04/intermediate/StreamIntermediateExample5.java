package com.example.java8.stream._04.intermediate;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediateExample5 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  
		
		integers.stream().distinct()  // <1>
						 .forEach(System.out::println); 
	}
}
