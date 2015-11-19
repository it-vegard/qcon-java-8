package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalExample9 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  

		 boolean result = integers.stream().anyMatch(x -> x == 5); // <1>
		System.out.println(result);
		
	}
}
