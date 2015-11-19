package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample12 {
	
	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<Integer> equifaxCreditScore = new CompletableFuture<>();
		CompletableFuture<Integer> transUnionCreditScore = new CompletableFuture<>();
		
		// accept the result from whichever future returns the result first
		equifaxCreditScore.acceptEither(transUnionCreditScore,  (Integer score) -> {
					if (score > 700) {
						// call service to increase credit limit 
						System.out.println("Credit Limit increasetd by " + 100);
					}
				});

		equifaxCreditScore.complete(750);
		transUnionCreditScore.complete(750);
	}
}
