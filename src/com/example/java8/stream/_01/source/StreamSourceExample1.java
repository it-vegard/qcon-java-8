package com.example.java8.stream._01.source;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamSourceExample1 {
	public static void main(String[] args) {
		
		System.out.println("Integer Stream Source");
		IntStream.rangeClosed(1, 5)             // <1>
				 .forEach(System.out::println); // <2>
		
		System.out.println("Long Stream Source");
		LongStream.range(0, 5)                    // <3>
				  .forEach(System.out::println);
				
	}
}
