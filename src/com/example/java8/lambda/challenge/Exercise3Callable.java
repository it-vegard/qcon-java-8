package com.example.java8.lambda.challenge;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise3Callable {

	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//TODO: Replace the MathTask with a Lambda expression
		Future<Integer> futureResult1 = executor.submit(new MathTask(1,1));
		Future<Integer> futureResult2 = executor.submit(new MathTask(5,10));
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

class MathTask implements Callable<Integer> {
	private final int a;
	private final int b;
	
	public MathTask(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public Integer call() throws Exception {
		return Exercise3Callable.doMath(a, b);
	}
	
}
	