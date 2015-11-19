package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalExample6 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);  

		Object[] objectArray = integers.stream().toArray();   // <2>
		Arrays.asList(objectArray).forEach(System.out::println);
		
		System.out.println();
		
		Integer[] integerArray = integers.stream().toArray(Integer[]::new); // <3>
		Arrays.asList(integerArray).forEach(System.out::println);
		
	}
}
