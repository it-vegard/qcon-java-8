package com.example.java8.annotations._01.repeating;

public class SomeService {

	@Schedule(frequency="hourly")
	@Schedule(frequency="monthly")
	public void doSomething()
	{
		
	}
}
