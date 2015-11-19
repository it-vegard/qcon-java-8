package com.example.java8.optional._01.examples.motivation;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private double balance;
	
	public Account(long id) {
		this.id = id;
		this.balance = 0.00;
	}

	public long getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount < 0) throw new IllegalArgumentException("Can't deposit a negative amount."); 
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		if (balance < amount) throw new IllegalArgumentException("Insufficient balance."); 
		this.balance -= amount;
	}

	@Override
	public int hashCode() {
		return (int) id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Account [id=%d, balance=$%.2f]", id, balance);
	}

}
