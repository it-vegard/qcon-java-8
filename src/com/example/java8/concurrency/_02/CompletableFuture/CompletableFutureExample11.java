package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
/**
 * 
 * In this example we combine the result of two futures and produce another 
 * future.  
 *
 */
public class CompletableFutureExample11 {
	
	
	
	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<Integer> creditScore = new CompletableFuture<>();
		CompletableFuture<Integer> onTimePaymentFrequency = new CompletableFuture<>();

		
		// wait for both futures to complete before invoking the accept function 
		creditScore.thenAcceptBoth(onTimePaymentFrequency,  (Integer score,
						Integer paymentFrequency) -> {
					if (score > 700 && paymentFrequency > 90) {
						// call service to increase credit limit 
						System.out.println("Credit Limit increasetd by " + 100);
					}
				});

		creditScore.complete(750);
		onTimePaymentFrequency.complete(91);
	}
}
