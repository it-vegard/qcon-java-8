package com.example.java8.lambda._05.defaultmethods;

public interface B {
	default void doSomething()
	{
		System.out.println("B");
	}
}
