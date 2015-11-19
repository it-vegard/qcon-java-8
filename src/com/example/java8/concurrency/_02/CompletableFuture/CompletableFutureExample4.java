package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample4 {
		
	public static void main(String[] args) throws InterruptedException, IOException {
		
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		// provide a callback as a labmda , the lamda will execute when the result is 
		// returned on the common fork join thread pool
		completableFuture.thenAcceptAsync(x -> {
			System.out.println("Executing on " + Thread.currentThread().getName());
			System.out.println(" thenAccept() " + x);	
		});
		
		completableFuture.complete("abc");	

		System.err.println("\nPlease any key to exit\n");
		System.in.read();
	}
}
