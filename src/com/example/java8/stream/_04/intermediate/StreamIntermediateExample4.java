package com.example.java8.stream._04.intermediate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateExample4 {
	public static void main(String[] args) throws IOException {

		List<String> lines = Arrays.asList("java 8", "streams are cool");
		
		lines.stream().flatMap( 
				       line -> {  // <1>
							String[] words = line.split(" +"); // <2>
							return Stream.of(words); // <3>
						})
					  .forEach(System.out::println);;
	}
}
