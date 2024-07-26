package com.Inbuilt.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicateRunner {
	
	public static void main(String[] args) {
		
		Predicate<String> p1=(x)->x.length()>4;
		Predicate<String> p2=(x)->Character.isLetter(x.charAt(0));
		
		String values="1one";
		System.out.println(p1.and(p2).test(values));
		System.out.println(p1.or(p2).test(values));
		
		
		
		List<String> l1= Arrays.asList("one","two","three","four");
		List<String> l2 = l1.stream().filter((x)->x.length()>3).collect(Collectors.toList());
		l2.forEach(x->System.out.println(x));
		
		
	}

}
