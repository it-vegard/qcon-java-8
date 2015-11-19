package com.example.java8.stream._03.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectorsExample7 {
	public static void main(String[] args) {
		List<String> letters = Arrays.asList("A", "B", "C"); // <1> 

		String result = letters.stream().collect(Collectors.joining(",")); // <1>
		System.out.println(result);
	}
}
