package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample7 {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		// we can chain multiple function to thenApply
		completableFuture.thenApply(x -> x.toUpperCase())
		                             .thenApply(x -> x.substring(1))
		                             .thenAccept(System.out::println);

		completableFuture.complete("abc");

	}
}
