package com.example.java8.lambda.challenge;

public class Exercise1Threading {

	public static void main(String[] args) {
		//TODO: Replace the anonymous inner class with a Lambda expression
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				doStuff();
			}
		});
		t.start();
	}

	public static void doStuff() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
}
