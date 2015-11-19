package com.example.java8.lambda._02.interfaces;

@FunctionalInterface
public interface PasswordEncoder4 {
	public String encode(String password, String salt) throws Exception; //<1>
}
