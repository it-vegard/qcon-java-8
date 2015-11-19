package com.example.java8.stream._02.terminal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalExample5 {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5); // <1>

		System.out.println("\nCollect stream results to a set");
		Set<Integer> set = integers.stream().collect(Collectors.toSet());  //<2>
		System.out.println(set);

		System.out.println("\nCollect stream results to a set");
		Set<Integer> results = new HashSet<Integer>();
		integers.stream().forEach(x->results.add(x));  //<2>
		System.out.println(set);

	}
}
