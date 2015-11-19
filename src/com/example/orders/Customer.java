package com.example.orders;


public class Customer {
	public enum Type { SILVER, GOLD, PLATNIUM };
	
	private String name;
	private Type type;
	
	public Customer(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", type=" + type + "]";
	} 
	
	
}
