package com.example.java8.lambda._01.syntax;

import java.util.Arrays;
import java.util.List;

public class LambdaSyntaxExample3 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		integers.forEach((x) -> { // <1>
			int y = x / 2; // <2>
			System.out.println(y);
		});
	}
}
