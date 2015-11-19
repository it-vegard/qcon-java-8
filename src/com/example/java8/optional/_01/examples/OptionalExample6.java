package com.example.java8.optional._01.examples;

import java.util.Optional;

public class OptionalExample6 {

	public static class Address {
		public String street;
	}
	
	public static class Customer { 
		public Integer id;
		public Optional<Address> address; 
	}
	
	public static class ExampleService {
		
		public Optional<Customer> getSomething(Integer id){
			
			Customer customer = new Customer();
			
			Address address = null;
			if(id % 2 == 0) {
				 address = new Address();
			 	 address.street = "Harwood Ave.";
			} 
			
			// if the address is null the optional is empty 
			customer.address = Optional.ofNullable(address);
			
			return Optional.of(customer);
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ExampleService exampleService = new ExampleService();
		
		Optional<Customer> optional = exampleService.getSomething(1);
		
		// notice that map results an optional inside an optional
		Optional<Optional<Address>> result = optional.map(x -> x.address);
	
		
		// flatmap returns an optional of the thing we are looking for 
		Optional<Address> flatMap = optional.flatMap(x -> x.address);
		
	}
}
