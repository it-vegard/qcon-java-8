package com.example.java8.optional._01.examples;

import java.util.Optional;

public class OptionalExample1 {

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
		
		// the return type forces the user of geSomething() to check if a result is present 
		// or not. Unlike when null is returned if something is not found the caller 
		// may forget to check if the return value is null and a null pointer exception 
		// is thrown. With optional the code becomes self documenting there is no change
		// that the user of method will forget to check if the result is present
		Optional<String> result = exampleService.getSomething(1);
		if(result.isPresent()) {
			System.out.println(result.get());
		} else { 
			System.out.println("no result found");
		}
		
		result = exampleService.getSomething(2);
		if(result.isPresent()) {
			System.out.println(result.get());
		} else { 
			System.out.println("no result found");
		}
		
		result.ifPresent( x -> { 
			System.out.println("Optional has value " + x);
		});
	}
}
