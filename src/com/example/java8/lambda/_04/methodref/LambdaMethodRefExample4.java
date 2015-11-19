package com.example.java8.lambda._04.methodref;

import java.util.function.Function;

public class LambdaMethodRefExample4 {

	public static void main(String[] args) {
	
		Function<String, String> mapper1 = x -> x.toUpperCase(); // <1>
		System.out.println(mapper1.apply("abc"));

		Function<String, String> mapper2 = String::toUpperCase; // <2>
		System.out.println(mapper2.apply("def"));
	}

}
