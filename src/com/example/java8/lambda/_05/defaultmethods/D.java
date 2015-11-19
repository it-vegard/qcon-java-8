package com.example.java8.lambda._05.defaultmethods;

public interface D extends A { // <1>
	
	@Override
	public default void doSomething() // <2>
	{
		System.out.println("D");
	}
}
