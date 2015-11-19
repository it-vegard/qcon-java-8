package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalExample7 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  

		Optional<Integer> result = integers.stream().findAny(); // <1>
		System.out.println(result.get());
		
	}
}
