package com.example.java8.stream._05.pipeline;

import static java.util.stream.Collectors.toList;

import java.util.List;

import com.example.orders.Data;
import com.example.orders.Order;

public class StreamPipelineExample2 {

	public static void main(String[] args) {

		// find all orders that have product 3 in them
		List<Order> result;
		
		result = Data.ORDERS.stream()
			.filter(
				order ->  order.getItems().stream().anyMatch(item -> item.getProduct() == Data.PRODUCT3)
			).collect(toList());
		
		System.out.println(result);
	}
}
