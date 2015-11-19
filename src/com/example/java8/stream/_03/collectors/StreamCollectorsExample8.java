package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExample8 {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("toronto","ottawa","montreal","vancouver");

		Map<Integer, List<String>> citiesByLength = cities.stream().collect(
				Collectors.groupingBy( city -> city.length() ) // <1>
				);
		System.out.println(citiesByLength);
	}
}
