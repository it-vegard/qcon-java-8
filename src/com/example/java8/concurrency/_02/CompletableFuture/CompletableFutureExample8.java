package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample8 {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		// exceptionally can transform an exception into a result
		completableFuture.exceptionally(ex -> {
										System.out.println(ex);
										System.out.println("transfroming exception to result");
										return "defualt";
									})
									.thenApply(x -> x.toUpperCase())
		                             .thenApply(x -> x.substring(1))
		                             .thenAccept(System.out::println);

		completableFuture.completeExceptionally(new IllegalStateException("error "));

	}
}
