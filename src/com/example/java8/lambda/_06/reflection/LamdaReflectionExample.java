package com.example.java8.lambda._06.reflection;


import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaReflectionExample {
	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = x -> System.out.print(x);
		Consumer<Integer> consumer2 = x -> System.out.print(x);
		
		if(consumer == consumer2) {
			System.out.println("they are the same");
		} else { 
			System.out.println("they are not the same");
		}
		
		if(consumer.equals(consumer2)) {
			System.out.println("Equals says they are the same");
		}
		System.out.println(consumer.getClass().getCanonicalName());
		System.out.println(consumer.getClass().getTypeName());
		
		Method[] methods = consumer.getClass().getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		integers.forEach(consumer);
	}
}
