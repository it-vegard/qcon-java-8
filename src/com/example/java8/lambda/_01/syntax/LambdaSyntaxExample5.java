package com.example.java8.lambda._01.syntax;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaSyntaxExample5 {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = x -> System.out.print(x); // <1>

		integers.forEach(consumer);
	}
}
