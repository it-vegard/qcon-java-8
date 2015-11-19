package com.example.java8.concurrency._02.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * This example shows how to throw an exception from a completable future 
 *
 */
public class CompletableFutureExample2 {
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
		System.out.println("\nCompleteing the future with an exception" );
		
		// here we throw an exception
		completableFuture.completeExceptionally( new IllegalStateException("An ecxeption from the futuer" ));
		
		// wait for the threads to finish 
		for (int i = 0; i < exampleThreads.length; i++) {
			exampleThreads[i].join();
		}	
		
	}
}
