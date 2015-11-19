package com.example.java8.lambda._05.defaultmethods;

public class CDImpl implements C, D { //<1>
	public static void main(String[] args) {
		new CDImpl().doSomething(); // <2>
	}
}
