package com.functionalInterface;

import java.util.function.Function;

public class FunctionRunner {

	public static void main(String[] args) {
		
		Function<String, Integer> func=(x)->x.length();
		Function<Integer,Integer> func1=(x)->x*2;
		
		// Compose
		 Function<String, Integer> fg= func1.compose(func);
		 
		 Function<String, Integer> fg1=  func.andThen(func1);
		
		
		
		System.out.println(covertSTringToInteger(fg, "Helloworld!"));
		System.out.println(covertSTringToInteger(fg1, "Indian"));
	}

	public static int covertSTringToInteger(Function<String, Integer> fun, String str) {

		return fun.apply(str);

	}

}
