package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamTerminalExample2 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		Optional<Integer> result;  // <1>
		
		result = integers.stream().min( // <2>
				(x, y) -> x - y  // <3>  
				); 
		
		System.out.println(result.get());
	}
}
