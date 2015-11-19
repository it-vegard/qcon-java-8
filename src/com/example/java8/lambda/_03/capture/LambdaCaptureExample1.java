package com.example.java8.lambda._03.capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample1 {
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		
		int var = 10;
		integers.forEach(x -> System.out.println(x + var)); //<1>
	}
}
