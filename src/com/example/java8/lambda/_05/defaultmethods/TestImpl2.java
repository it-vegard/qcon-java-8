package com.example.java8.lambda._05.defaultmethods;

public class TestImpl2 implements Test {

	@Override
	public void doSomething() { //<1>
		System.out.println("TestImpl2");
	}
	
	public static void main(String[] args) {
		TestImpl2 testImpl = new TestImpl2();
		testImpl.doSomething(); //<2>
	}
}
