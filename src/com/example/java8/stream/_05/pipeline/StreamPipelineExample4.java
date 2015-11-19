package com.example.java8.stream._05.pipeline;

import java.util.OptionalDouble;

import com.example.orders.Data;
import com.example.orders.Order;

public class StreamPipelineExample4 {

	public static void main(String[] args) {
		
		// calculate the average price of an order
		OptionalDouble average = Data.ORDERS.stream().mapToDouble(Order::total).average();
		
		System.out.println("Average order price $" + average.getAsDouble());
	}
}
