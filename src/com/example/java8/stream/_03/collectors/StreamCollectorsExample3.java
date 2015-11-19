package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class StreamCollectorsExample3 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  

		Map<UUID, Integer> map = integers.stream().collect(Collectors.toMap(
				x -> UUID.randomUUID() ,  // <1>
				x -> x)); // <2>
		System.out.println(map);
	
		
	}
}
