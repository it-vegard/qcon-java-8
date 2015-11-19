package com.example.java8.stream._01.source;


public class StreamSourceExample3 {
	public static void main(String[] args) {
		long length = "ABCDEF".chars().count(); // <1>
		System.out.println(length);
	}
}
