package com.example.java8.concurrency._02.CompletableFuture;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;


public class CompletableFutureExample14 {
	
	public static void main(String[] args) throws InterruptedException,
			IOException {

		CompletableFuture<Integer> dowJones = new CompletableFuture<>();
		CompletableFuture<Integer> tsx300 = new CompletableFuture<>();
		CompletableFuture<Integer> ftse100 = new CompletableFuture<>();
		
		CompletableFuture.anyOf(dowJones, tsx300, ftse100).thenAccept( (Object result) -> { 
			try {
				System.out.println("one of the futures has completed");
				
				if(dowJones.isDone()) {
					System.out.println("Dow street average  " + dowJones.get());	
				}
				
				if(tsx300.isDone()) {
					System.out.println("TSX 300 average " + tsx300.get());
				}
				
				if(ftse100.isDone()) {
					System.out.println("FTSE 100 average " + ftse100.get());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
			
		
	
		dowJones.complete(12_000);
		tsx300.complete(13_000);
		ftse100.complete(10_0000);
		
	}
}
