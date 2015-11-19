package com.example.java8.lambda._05.defaultmethods;

public class ABImpl2 implements A, B {
	@Override
	public  void doSomething() { // <1>
		System.out.println("ABImpl2");
		A.super.doSomething(); // <2>
	}
	
	public static void main(String[] args) {
		new ABImpl2().doSomething();
	}
}
