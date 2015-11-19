package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExample9 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("toronto","ottawa","montreal","vancouver");

		 Map<Boolean, List<String>> partition = cities.stream().collect(
				Collectors.partitioningBy(city -> city.length() < 7) // <1>
				);
		System.out.println(partition); // <2>
		
	}
}
