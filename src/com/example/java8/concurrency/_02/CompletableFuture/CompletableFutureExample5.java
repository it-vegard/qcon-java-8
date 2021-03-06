package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample5 {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		completableFuture.thenApply(x -> {
			System.out.println("thenAppy running on thread " + Thread.currentThread().getName());
			return x.toUpperCase();
		}).thenAccept(x ->{ 
			System.out.println("thenAccept() running on thread " + Thread.currentThread().getName());
			System.out.println(x);
		});

		completableFuture.complete("abc");

	}
}
