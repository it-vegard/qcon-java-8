package com.example.java8.lambda._01.syntax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSyntaxExample6 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = (Integer x) -> { // <1>
			System.out.print(x);
		};

		integers.forEach(consumer);
	}
}
