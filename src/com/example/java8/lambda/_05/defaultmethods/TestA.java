package com.example.java8.lambda._05.defaultmethods;

public interface TestA extends Test { // <1> 
	
	@Override
	default void doSomething()  // <2>
	{
		System.out.println("TestA");
	}
}
