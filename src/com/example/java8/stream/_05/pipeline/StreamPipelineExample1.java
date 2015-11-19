package com.example.java8.stream._05.pipeline;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.example.orders.Data;
import com.example.orders.Order;

public class StreamPipelineExample1 {

	public static void main(String[] args) {

		// find all orders with a price less than 10
		List<Order> result = Data.ORDERS.stream()
				.filter(order -> order.total() < 10).collect(toList());
		System.out.println(result);
	}
}
