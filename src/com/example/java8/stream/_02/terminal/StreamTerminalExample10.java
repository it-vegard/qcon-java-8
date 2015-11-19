package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalExample10 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  

		 boolean result = integers.stream().allMatch(x -> x == 5); // <1>
		 System.out.println(result);
		
		 boolean result2 = integers.stream().allMatch(x -> x < 6); // <2>
		 System.out.println(result2);
	}
}
