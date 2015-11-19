package com.example.java8.concurrency._02.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * see http://www.nurkiewicz.com/2013/05/java-8-definitive-guide-to.html
 * http://www.nurkiewicz.com/2013/05/java-8-completablefuture-in-action.html
 *
 */
public class CompletableFutureExample1 {
	private static class ExampleThread extends Thread { 
		
		private final CompletableFuture<String> completableFuture;
		
		public ExampleThread(CompletableFuture<String> future) {
			this.completableFuture = future;
		}
		
		@Override
		public void run() {
			try {
				System.out.println("About to call the future from " + Thread.currentThread().getName());
				String result = this.completableFuture.get();
				System.out.println(Thread.currentThread().getName() + " got  " + result  + " from the future");
				
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		// create a completable future with no result 
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		// create some threads and start them
		ExampleThread[] exampleThreads = new ExampleThread[3];
		for (int i = 0; i < exampleThreads.length; i++) {
			exampleThreads[i] = new ExampleThread(completableFuture);
			exampleThreads[i].start();
		}
	
		System.out.println("\nStarted three thread that are blocked waiting on the future");
		Thread.sleep(1000);
		System.out.println("\nCompleteing the future with result abc" );
		completableFuture.complete("abc");
		
		// wait for the threads to finish 
		for (int i = 0; i < exampleThreads.length; i++) {
			exampleThreads[i].join();
		}	
		
	}
}
