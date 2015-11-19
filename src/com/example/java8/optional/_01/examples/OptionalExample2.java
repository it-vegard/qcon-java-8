package com.example.java8.optional._01.examples;

import java.util.Optional;

public class OptionalExample2 {

	public static class ExampleService { 
		public Optional<String> getSomething(Integer id){
			if(id % 2 == 0) {
				return Optional.of(id.toString());
			} else { 
				return Optional.empty();
			}
		}
	}
	
	public static void main(String[] args) {
		
		ExampleService exampleService = new ExampleService();
		
		Optional<String> result = exampleService.getSomething(1);
	
		// if the result is present execute the lambda 
		result.ifPresent( x -> { 
			System.out.println("Optional has value " + x);
		});
	}
}
