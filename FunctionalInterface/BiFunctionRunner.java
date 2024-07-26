package com.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionRunner {
	
	public static void main(String[] args) {
		
		BiFunction<List<String>, String, Boolean> bifunctiontest =(x,y)->x.contains(y);
		//BiFunction<List<String>, Integer, String> bifunctiontest1 =(x,y)->x.get(y);
		
		List<String> nameList=Arrays.asList("Dhana","Sangee","MrittiKutty","Harish");
		String name="Harishkutty";
		
		System.out.println(bifunctiontest.apply(nameList, name));
		
		
		BiFunction<List<String>, Integer, String> bifunctiontest3 =(x,y)->x.get(y);
		Function<String,Integer> bifunctiontest4 =(x)->x.length();
		
		BiFunction<List<String>, Integer, Integer> func8= bifunctiontest3.andThen(bifunctiontest4);
		System.out.println(func8.apply(nameList, 0));
		
		
		
		
		
	}
	
	


}
