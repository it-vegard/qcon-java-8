package com.example.java8.lambda.challenge;

public class Solution1Threading {

	public static void main(String[] args) {
		//Solution 1
		Thread t1 = new Thread(() -> doStuff());
		t1.start();
		//Solution 2
		Thread t2 = new Thread(Solution1Threading::doStuff);
		t2.start();
	}

	public static void doStuff() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
}
