package com.Inbuilt.FunctionalInterface;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestSupplierTime {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Example 1
		LocalDateTime dt =  LocalDateTime.now();
		System.out.println(dt);
		
		Supplier<LocalDateTime> supplier=()->LocalDateTime.now();
		
		
		//Thread.sleep(5000);
		
		System.out.println(dt);
		System.out.println(supplier.get());
		
		LocalDateTime dt1 =  LocalDateTime.now();
		System.out.println(dt1);
		
		Supplier<LocalDateTime> supplier1=()->LocalDateTime.now();
		System.out.println(supplier1.get());
		
		// Example 2
		
		
		 List<String> list = Arrays.asList("Hello", "B2C", "World", "Stack Overflow", "is", "a", "gr8", "platform");
		 
		 Stream<String> str=list.stream().filter(x->x.length()<5).map(x->x.substring(0));
		 System.out.println(str.anyMatch(x->Character.isDigit(x.charAt(0))));
		 //System.out.println(str.anyMatch(x->Character.isLetter(x.charAt(0))));
		 
		 // Alternate
		 
		 Supplier<Stream<String>> str1= ()->list.stream().filter(x->x.length()<5).map(x->x.substring(0));
		 
		 System.out.println(str1.get().anyMatch(x->Character.isDigit(x.charAt(0))));
		 System.out.println(str1.get().anyMatch(x->Character.isLetter(x.charAt(0))));
		 
		
	}

}
