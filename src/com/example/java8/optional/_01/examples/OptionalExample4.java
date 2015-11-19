package com.example.java8.optional._01.examples;

import java.util.Optional;

public class OptionalExample4 {

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
		
		Optional<String> result = exampleService.getSomething(2);
	
		// If the result is present check that it matches the filter lambda and if 
		// it does not make the optional empty 
		
		result.map( x -> x + "5").ifPresent( x -> { 
			System.out.println("Optional has value " + x);
		});
	}
}
