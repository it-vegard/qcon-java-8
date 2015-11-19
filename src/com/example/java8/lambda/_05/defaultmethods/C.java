package com.example.java8.lambda._05.defaultmethods;

public interface C extends A { //<1>
	
	default void other()
	{
		System.out.println("C");
	}

}
