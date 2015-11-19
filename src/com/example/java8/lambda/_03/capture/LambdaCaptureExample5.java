package com.example.java8.lambda._03.capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample5 {

	private int var = 1; // <1>
	private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

	private void doSomething() {
		integers.forEach(x -> System.out.println(x + var)); // <1>
	}

	public static void main(String[] args) {
		new LambdaCaptureExample5().doSomething();
	}
}
