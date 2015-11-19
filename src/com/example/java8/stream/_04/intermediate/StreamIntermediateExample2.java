package com.example.java8.stream._04.intermediate;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamIntermediateExample2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  
		
		System.out.println("Create a new list with 1 added to each item");
		List<Integer> mappedIntegers = integers.stream().map(x -> x + 1)  // <1>
						 .collect(Collectors.toList()); // <2>
		mappedIntegers.forEach(System.out::println); 
		
		System.out.println("\nAdd up all the integers in the list");
		int sum = integers.stream().mapToInt(x -> x).sum();  // <3>
		System.out.println(sum);
		
		System.out.println("\nAverage all the integers");
		OptionalDouble average = integers.stream().mapToInt(x -> x).average(); // <3>
		System.out.println(average.getAsDouble());
		
		System.out.println("\nAverage all the integers");
		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics(); // <4>
		System.out.println(stats);
	}
}
