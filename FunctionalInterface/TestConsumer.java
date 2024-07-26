package com.Inbuilt.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {
	
	public static void main(String[] args) {
		
		 List<String> list = Arrays.asList("Hello", "B2C", "World", "Stack Overflow", "is", "a", "gr8", "platform");
		 Consumer<String> cons=(x)->System.out.println(x.toUpperCase());
		 Consumer<String> cons1=(x)->System.out.println(x.length());
		 printList(list, cons,cons1);
		
	}
	
	public static void printList(List<String> lst,Consumer<String> cons,Consumer<String> cons1) {
		for (String string : lst) {
			cons.andThen(cons1).accept(string);
		}
		
	}
	

}
