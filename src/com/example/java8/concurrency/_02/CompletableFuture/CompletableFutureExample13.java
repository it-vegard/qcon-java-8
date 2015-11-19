package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample13 {
	
	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<Integer> dowJones = new CompletableFuture<>();
		CompletableFuture<Integer> tsx300 = new CompletableFuture<>();
		CompletableFuture<Integer> ftse100 = new CompletableFuture<>();
		
		CompletableFuture.allOf(dowJones, tsx300, ftse100).thenRun( () -> { 
			try {
				System.out.println("All futures have completed");
				
				System.out.println("Dow street average  " + dowJones.get());
				System.out.println("TSX 300 average " + tsx300.get());
				System.out.println("FTSE 100 average " + ftse100.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
			
		
	
		dowJones.complete(12_000);
		tsx300.complete(13_000);
		ftse100.complete(10_0000);
		
	}
}
