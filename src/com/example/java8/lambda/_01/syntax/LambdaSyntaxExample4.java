package com.example.java8.lambda._01.syntax;

import java.util.Arrays;
import java.util.List;

public class LambdaSyntaxExample4 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		integers.forEach((Integer x) -> { // <1>
			x = x + 10;
			System.out.println(x);
		});

	}
}
