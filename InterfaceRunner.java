package com.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceRunner {
	
	public static void main(String[] args) {
		GenericInterface genericInterface= (str) ->  str.stream().collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println(getVal(genericInterface, Arrays.asList("ONE","THREE","FIVE","TWELVE")));
		
		System.out.println(genericInterface.toUppercase("dhana"));
		
		System.out.println(GenericInterface.toLowercase("DHANA"));
		
		
	}
		
	
	public static Map<String,Integer> getVal(GenericInterface genericInterface,List<String> values){
		return genericInterface.createMap(values);
		
	}

}
