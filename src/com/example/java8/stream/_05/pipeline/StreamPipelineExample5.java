package com.example.java8.stream._05.pipeline;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.orders.Data;
import com.example.orders.OrderItem;
import com.example.orders.Product;

@SuppressWarnings("unused")
public class StreamPipelineExample5 {

	public static void main(String[] args) {
		
		// Produce a map where the key is the product name and the value is the 
		// total quantity of product orders. For example a map entry might be 
		// Key = Product 1 , value = 10 indicating that product 1 was ordered 
		// 10 times.
		
		Stream<List<OrderItem>> orderItemstream = Data.ORDERS.stream().map(order -> order.getItems());
		Stream<OrderItem> orderItemsStreams = orderItemstream.flatMap(items -> items.stream());
		
		//orderItemsStreams.collect(Collectors.toMap( orderItem::getProduct(), ))
		
		//orderItemsStreams.forEach(System.out::println);
		
//		Map<Product,Integer> result = orderItemsStreams.collect(
//				Collectors.groupingBy(OrderItem::getProduct, Collectors.reducing(0,(orderItem1, orderItem2) -> orderItem1.getQuantity() + orderItem2.getQuantity())));
	}
}
