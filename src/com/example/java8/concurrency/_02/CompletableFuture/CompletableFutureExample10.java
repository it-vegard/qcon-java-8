package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
/**
 * 
 * In this example we combine the result of two futures and produce another 
 * future.  
 *
 */
public class CompletableFutureExample10 {

	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<Integer> creditScore = new CompletableFuture<>();
		CompletableFuture<Integer> onTimePaymentFrequency = new CompletableFuture<>();

		CompletableFuture<Integer> increaseCreditLimitBy = creditScore
				.thenCombine(onTimePaymentFrequency, (Integer score,
						Integer paymentFrequency) -> {
					if (score > 700 && paymentFrequency > 90) {
						return 100;
					} else {
						return 0;
					}
				});

		increaseCreditLimitBy.thenAccept(x -> System.out.println("Limit increased by " + x));
		creditScore.complete(750);
		onTimePaymentFrequency.complete(60);
	}
}
