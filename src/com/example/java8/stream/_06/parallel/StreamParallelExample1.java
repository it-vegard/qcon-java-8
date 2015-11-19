package com.example.java8.stream._06.parallel;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StreamParallelExample1 {
	
	private static class AddOne implements Function<BigDecimal, BigDecimal> {

		@Override
		public BigDecimal apply(BigDecimal x) {
			/* PUT a break point on the line below to see all the threads 
			 * created by the parallel stream it should be equal to the 
			 * number of cores on the machine, when this function is 
			 * executed as part of the parallel stream. 
			 * 
			 * Once the break point is hit remove the break point and let
			 * it run to completion. 
			 * 
			 */
			return  x.add( new BigDecimal(1));
		}
		
	}
	private static long serialStream(List<BigDecimal> numbers)
	{
		final long startTime = System.currentTimeMillis();
		
		numbers.stream().map( new AddOne() ).count();
		
		final long endTime = System.currentTimeMillis(); 
	
		final long duration = endTime - startTime; 
		System.out.println("Serial Stream Processing Completed in " + duration + " ms");
		
		return duration; 
	}

	private static long parallelStream(List<BigDecimal> numbers)
	{
		final long startTime = System.currentTimeMillis();
		
		numbers.parallelStream().map( new AddOne()).count();
	
		final long endTime = System.currentTimeMillis(); 
		
		final long duration = endTime - startTime; 
		System.out.println("Prallel Stream Processing Completed in " + duration + " ms");
		
		return duration;
	}
	
	public static void runTest(List<BigDecimal> numbers)
	{		
		// put a break point on the line below to observe the parallel 
		// processing. After the executions stops here you should see
		// on thread per core waiting on this line. 
		long parallelStreamDuration = parallelStream(numbers);
		long serialStreamDuration = serialStream(numbers);
	
		double factor = serialStreamDuration / parallelStreamDuration;
		System.out.println("serialStreamDuration / parallelStreamDuration = " + factor);
	}
	/**
	 * Create a list of 10 million big decimals then do stream processing
	 * on the list both serially and in parallel and compare the 
	 * total duration and print out the factor difference.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		final int listSize = 10_000_000;
	
		List<BigDecimal> numbers = new ArrayList<>(listSize); 
		for(int i=0; i < listSize; i++)
		{
			numbers.add( new BigDecimal(i));
		}
		
		System.out.println("Round #1");
		runTest(numbers);

		System.out.println("\nRound #2");
		runTest(numbers);
		
		System.out.println("\nRound #3");
		runTest(numbers);
		
	}
}
