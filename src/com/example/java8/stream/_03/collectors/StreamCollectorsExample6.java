package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsExample6 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5); // <1> 

		Double average = integers.stream().collect(Collectors.averagingInt(x -> x)); // <1>
		System.out.println(average);
	}
}
