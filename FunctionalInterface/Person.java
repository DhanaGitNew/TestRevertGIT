package com.functionalInterface;

@FunctionalInterface
public interface Person {
	
	public void printName();
	
	/*
	 * public default Integer printResult(String str) { return str.length(); }
	 */
	
	public static Integer printResultStatic(String str) {
		return str.length();
	}
	
	


}
