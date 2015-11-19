package com.example.java8.concurrency._01.accumulator;

import java.io.IOException;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;

public class AccumulatorExample1 {

	/**
	 * We are implementing this functional interface to make it easier to put
	 * break points in applyAsLong method. normally we would just use the 
	 * lambda syntax.
	 * 
	 *  Some Resources: 
	 *  
	 *   http://minddotout.wordpress.com/2013/05/11/java-8-concurrency-longadder/
	 *   http://blog.palominolabs.com/2014/02/10/java-8-performance-improvements-longadder-vs-atomiclong/
	 *   http://www.takipiblog.com/2014/04/16/java-8-longadders-the-fastest-way-to-add-numbers-concurrently/
	 *   
	 *    
	 */
	private static class Adder implements LongBinaryOperator {

		// put a break point in the method below and notice that all the threads 
		// stop on this method and start with left value of 0 and a right value equal 
		// to the incrementBy from the class below. 
		@Override
		public long applyAsLong(long left, long right) {
			System.out.println(String.format("%s thread applyAsLong called with left=%s,right=%s" ,Thread.currentThread().getName(),left,right));
			return left + right;
		}
	}

	/**
	 *  A thread that will use the accumulator, notice that in the code below the 
	 *  accumulator is being updated but it's value is not being read. If the value 
	 *  of an accumulator is not read then each thread will accumulate its value 
	 *  using a separate variable 
	 *
	 */
	private static class AddingThread extends Thread {

		private final LongAccumulator accumulator;
		private final long accumulateBy;
		private final int iterations;
		private long value = 0; 

		public AddingThread(LongAccumulator accumulator, long accumulateBy,
				int iterations) {
			this.accumulator = accumulator;
			this.accumulateBy = accumulateBy;
			this.iterations = iterations;
		}

		@Override
		public void run() {
			for (int i = 0; i < iterations; i++) {
				accumulator.accumulate(accumulateBy);				
				 value += accumulateBy;
			}
		}

		public long getValue() {
			return value;
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		LongAccumulator accumulator = new LongAccumulator(new Adder(), 0);
		
		// Create some threads
		AddingThread[] threads = new AddingThread[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new AddingThread(accumulator, i+1, 3);
		}

		// start  the threads
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

		// wait for the threads to terminate
		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		// print the accumulated value 
		System.out.println("Accumulator Value " +  accumulator.longValue());
		
		// compute the value independently of the accumulator and print it out
		long finalResult = 0;
		for (int i = 0; i < threads.length; i++) {
			finalResult += threads[i].getValue();
		}
		System.out.println("Final Result " + finalResult);
	}
}
