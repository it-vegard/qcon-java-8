package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectorsExample2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  
		
		Set<Integer> set = integers.stream().collect(Collectors.toSet());  //<3>
		System.out.println(set);
	}
}
