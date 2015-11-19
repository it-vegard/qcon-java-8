package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamTerminalExample1 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		Long count = integers.stream().count(); // <1>
		
		System.out.println(count);
	}
}
