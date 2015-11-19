package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample9 {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		// exceptionally can transform an exception into a result
		completableFuture.handle((String result, Throwable exception) -> { 
			if(result != null) {
				return result.toUpperCase();
			} else { 
				return "Default";
			}
		} ).thenAccept( System.out::println);

		completableFuture.completeExceptionally(new IllegalStateException("error "));
		
		// notice how this call to complete is just ignored 
		completableFuture.complete("abc");
	}
}
