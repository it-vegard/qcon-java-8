package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalExample4 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer result = integers.stream().reduce( // <1>
				0,  // <2>
				(oldResult,nextValue) -> oldResult+nextValue*nextValue); // <3>
		
		System.out.println(result);		
	}
}
