package com.example.java8.lambda._02.interfaces;

public class FunctionalInterfaceExample1 {

	public static void doSomething(PasswordEncoder1 encoder) {
		String salted = encoder.encode("abc", "123");
		System.out.println(salted);
	}

	public static PasswordEncoder1 returnSomething() {
		return (password, salt) -> password.toUpperCase();
	}

	public static void main(String[] args) {

		PasswordEncoder1 noOp = (password, salt) -> {
			System.out.println(password);
			return password;
		};

		doSomething(noOp);
		doSomething(returnSomething());
	}
}
