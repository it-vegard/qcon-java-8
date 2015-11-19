package com.example.orders;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private Customer customer;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order(Customer customer)
	{
		this.customer = customer;
	}

	public Order addItem(Product product, int quantity){
		items.add( new OrderItem(product, quantity));
		return this;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<OrderItem> getItems() {
		return items;
	}
	public void setItems(List<OrderItem> items) {
		this.items = items;
	}
	
	public int total(){ 
		return this.items.stream().mapToInt(item -> item.getQuantity() * item.getProduct().getPrice()).sum();		
	}

	@Override
	public String toString() {
		return "\n" + customer.getName() + " Order, $" + total() + " " + items ;
	}
	
	
	
}
