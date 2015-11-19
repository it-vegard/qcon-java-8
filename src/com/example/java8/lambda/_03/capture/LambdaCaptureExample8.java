package com.example.java8.lambda._03.capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample8 {

	private String var = "a"; // <1>
	private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

	private void doSomething() {
		integers.forEach(x -> System.out.println(x + this.var.toUpperCase())); // <1>
	}

	public static void main(String[] args) {
		new LambdaCaptureExample8().doSomething();
	}
}
