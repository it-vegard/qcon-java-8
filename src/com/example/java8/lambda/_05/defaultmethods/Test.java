package com.example.java8.lambda._05.defaultmethods;

public interface Test {
	default void doSomething() // <1>
	{
		System.out.println("Test");
	}
}
