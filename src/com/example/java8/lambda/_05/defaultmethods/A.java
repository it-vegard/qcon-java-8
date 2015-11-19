package com.example.java8.lambda._05.defaultmethods;

public interface A {
	default void doSomething()
	{
		System.out.println("A");
	}
}
