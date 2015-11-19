package com.example.java8.lambda._03.capture;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaCaptureExample7 {

	private static final LambdaCaptureExample7 INSTANCE = new LambdaCaptureExample7();
	private final int var = 1; 
	private List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

	public void doSomething() {
		integers.forEach(x -> {
			System.out.println(x + this.var); // <1>
			if (this == INSTANCE) { // <1>
				System.out
						.println("Within the lambda body this refers to the this of the enclosing object");
			}
		});
		
		integers.forEach( new Consumer<Integer>(){ // <2>

			private int state=10; // <3> 
			
			@Override
			public void accept(Integer x) {
				int y = this.state + LambdaCaptureExample7.this.var + x; // <4>
				System.out.println("Anonymous class " + y);						
			}
			
		});
		
	}

	public static void main(String[] args) {
		INSTANCE.doSomething();
	}
}
