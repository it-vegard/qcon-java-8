package com.example.orders;

import java.util.Arrays;
import java.util.List;

public class Data {
	
	public static final Product PRODUCT1 = new Product("Product 1", 1);
	public static final Product PRODUCT2 = new Product("Product 2", 2);
	public static final Product PRODUCT3 = new Product("Product 3", 3);
	
	public static final Customer SILVER1 = new Customer("Silver 1", Customer.Type.SILVER);
	public static final Customer SILVER2 = new Customer("Silver 2", Customer.Type.SILVER);
	
	public static final Customer GOLD1 = new Customer("Gold 1", Customer.Type.GOLD);
	public static final Customer GOLD2 = new Customer("Gold 2", Customer.Type.GOLD);
	public static final Customer GOLD3 = new Customer("Gold 3", Customer.Type.GOLD);
	
	public static final Customer PLATNIUM1 = new Customer("Platinum 1", Customer.Type.PLATNIUM);
	public static final Customer PLATNIUM2 = new Customer("Platinum 2", Customer.Type.PLATNIUM);
	public static final Customer PLATNIUM3 = new Customer("Platinum 3", Customer.Type.PLATNIUM);
	public static final Customer PLATNIUM4 = new Customer("Platinum 4", Customer.Type.PLATNIUM);
	
	
	public static final List<Product> products = Arrays.asList(
			PRODUCT1, PRODUCT2, PRODUCT3
	);
	
	public static final List<Customer> customers = Arrays.asList(
			SILVER1,SILVER2,GOLD1,GOLD2,GOLD3,PLATNIUM1,PLATNIUM2,PLATNIUM3,PLATNIUM4
	);
	
	public static final Order SILVER1_ORDER = new Order(SILVER1);
	public static final Order SILVER2_ORDER = new Order(SILVER2);
	
	public static final Order GOLD1_ORDER = new Order(GOLD1);
	public static final Order GOLD2_ORDER = new Order(GOLD2);
	public static final Order GOLD3_ORDER = new Order(GOLD3);
	
	public static final Order PLATNIUM1_ORDER = new Order(PLATNIUM1);
	public static final Order PLATNIUM2_ORDER = new Order(PLATNIUM2);
	public static final Order PLATNIUM3_ORDER = new Order(PLATNIUM3);
	public static final Order PLATNIUM4_ORDER = new Order(PLATNIUM4);
	
	public static final List<Order> ORDERS = Arrays.asList(
			SILVER1_ORDER,SILVER2_ORDER,GOLD1_ORDER,GOLD2_ORDER,GOLD3_ORDER,
			PLATNIUM1_ORDER,PLATNIUM2_ORDER,PLATNIUM3_ORDER,PLATNIUM4_ORDER
	);
	
	static { 
	
		SILVER1_ORDER.addItem(PRODUCT1, 1);
		SILVER2_ORDER.addItem(PRODUCT1, 2);
		
		GOLD1_ORDER.addItem(PRODUCT1, 1).addItem(PRODUCT2, 1);
		GOLD2_ORDER.addItem(PRODUCT1, 2).addItem(PRODUCT2, 2);
		GOLD3_ORDER.addItem(PRODUCT1, 3).addItem(PRODUCT2, 3);
		
		PLATNIUM1_ORDER.addItem(PRODUCT1, 1).addItem(PRODUCT2,1).addItem(PRODUCT3, 1);
		PLATNIUM2_ORDER.addItem(PRODUCT1, 2).addItem(PRODUCT2,2).addItem(PRODUCT3, 2);
		PLATNIUM3_ORDER.addItem(PRODUCT1, 3).addItem(PRODUCT2,3).addItem(PRODUCT3, 3);
		PLATNIUM4_ORDER.addItem(PRODUCT1, 4).addItem(PRODUCT2,4).addItem(PRODUCT3, 4);
	}
	
	public static void main(String[] args) {
		System.out.println("****** Order data Set *****");
		ORDERS.stream().forEach(System.out::println);
	}
}
