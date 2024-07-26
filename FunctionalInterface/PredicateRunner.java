package com.functionalInterface;

import java.util.function.Predicate;

public class PredicateRunner {
	
	public static void main(String[] args) {
		
		Predicate<String> pr=(x)->x.equalsIgnoreCase("HELLO");
		System.out.println(pr.test("Hello"));
		
		Predicate<String> pr1=(x)->x.endsWith("U");
		
		//AND
		Predicate<String> pr2= pr.and(pr1);
		System.out.println(pr2.test("HELLO"));
		
		//OR
		Predicate<String> pr3= pr.or(pr1);
		System.out.println(pr3.test("HELLU"));
		
		Predicate<String> pr4=(x)->x.equalsIgnoreCase("HELLO");
		Predicate<String> pr5 = pr4.negate();
		System.out.println(pr5.test("HELL"));
	}

}
