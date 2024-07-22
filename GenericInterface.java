package com.functionalInterface;

import java.util.List;
import java.util.Map;

@FunctionalInterface
public interface GenericInterface {
	
	public Map<String,Integer> createMap(List<String> str);
	
	public default String toUppercase(String s) {
		return s.toUpperCase();
		
	}
	
	public static String toLowercase(String s) {
		return s.toLowerCase();
		
	}


}
