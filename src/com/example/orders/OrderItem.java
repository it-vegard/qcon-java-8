package com.example.orders;

public class OrderItem {
	private Product product;
	private int quantity;
	
	public OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "\n\t{"+ product.getName() + "," + quantity + "}";
	}
}
