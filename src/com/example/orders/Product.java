package com.example.orders;


public class Product {
	
	private String name;
	private int price;

	public Product(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}