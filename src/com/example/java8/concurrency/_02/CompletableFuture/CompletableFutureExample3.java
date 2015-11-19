package com.example.java8.concurrency._02.CompletableFuture;

import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample3 {
		
	public static void main(String[] args) throws InterruptedException {
		
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		
		// provide a callback as a labmda , the lamda will execute when the result is 
		// returned. 
		completableFuture.thenAccept(x -> {
			System.out.println("Executing on " + Thread.currentThread().getName());
			System.out.println(" thenAccept() " + x);	
		});
		
		completableFuture.complete("abc");	
	}
}
