package com.functionalInterface;

import java.util.function.Consumer;

public class ConsumerRunner {
	
	public static void main(String[] args) {
		
		Consumer<String> cons=(x)->System.out.println(x.length());
		Consumer<String> cons1=(x)-> System.out.println(x.equalsIgnoreCase("Dhana"));
		Consumer<String> cons2=  cons.andThen(cons1);
		
		cons2.accept("Dhanas");
		
	}

}
