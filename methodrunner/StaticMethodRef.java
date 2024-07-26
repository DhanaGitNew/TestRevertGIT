package com.methodrunner;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StaticMethodRef {
	
	
	public boolean test(String str) {
		return str.endsWith("a");
	}
	
	public char test1(String str) {
		return str.charAt(1);
	}

	public static void main(String[] args) {
		StaticMethodRef staticMethodRef = new StaticMethodRef();
		Predicate<String> predicate=staticMethodRef::test;
		System.out.println(predicate.test("Dhana"));
		 List<String> lst = Arrays.asList("a","b","c");
		 LinkedList<String> l1= lst.stream().collect(Collectors.toCollection(()-> new LinkedList<String>()));
		 System.out.println(l1.getClass());
		 
		
	}
}
