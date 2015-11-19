package com.example.java8.lambda._04.methodref;

import java.util.function.Function;

public class LambdaMethodRefExample3 {

	public static void main(String[] args) {
	
		Function<String, Integer> mapper1 = x -> new Integer(x); // <1>
		System.out.println(mapper1.apply("11"));

		Function<String, Integer> mapper2 = Integer::new;  // <2>
		System.out.println(mapper2.apply("11"));
	}

}
