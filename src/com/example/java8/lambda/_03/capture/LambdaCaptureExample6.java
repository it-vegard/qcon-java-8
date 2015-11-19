package com.example.java8.lambda._03.capture;

import java.util.Arrays;
import java.util.List;

public class LambdaCaptureExample6 {

	private static final LambdaCaptureExample6 INSTANCE = new LambdaCaptureExample6();
	private int var = 1; 
	private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

	public void doSomething() {
		integers.forEach(x -> {
			System.out.println(x + this.var); // <1>
			if (this == INSTANCE) { // <2>
				System.out
						.println("Within the lambda body this refers to the this of the enclosing object");
			}
		});
	}

	public static void main(String[] args) {
		INSTANCE.doSomething();
	}
}
