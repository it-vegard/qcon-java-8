package com.example.java8.lambda._02.interfaces;

@FunctionalInterface
public interface PasswordEncoder1 {
	public String encode(String password, String salt);
}
