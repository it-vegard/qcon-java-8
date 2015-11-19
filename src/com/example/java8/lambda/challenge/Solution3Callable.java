package com.example.java8.lambda.challenge;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution3Callable {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		/* Solution: Replace the MathTask with a Lambda expression */
		/* Note: Some compilers, such as IntelliJ, need a cast to distinguish Callable from Runnable. */
//		Future<Integer> futureResult1 = executor.submit(() -> doMath(1,1));
//		Future<Integer> futureResult2 = executor.submit(() -> doMath(5,10));
		Future<Integer> futureResult1 = executor.submit((Callable<Integer>) () -> doMath(1,1));
		Future<Integer> futureResult2 = executor.submit((Callable<Integer>) () -> doMath(5,10));
		
		System.out.println("1 +  1 = " + futureResult1.get());
		System.out.println("5 + 10 = " + futureResult2.get());
	}
	
	static Integer doMath(int a, int b) {
		takeLongTime();
		return a+b;
	}

	private static void takeLongTime() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.interrupted();
		}
	}

}
