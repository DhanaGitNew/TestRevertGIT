package com.functionalInterface;

@FunctionalInterface
public interface Behave extends Person {
	
	// We can use same method from parent if you change the method name will result in to error
	public void printName();
	
	
	public default Integer printResult(String str) {
		return str.length()+1;
	}
	
	
	public default Integer printResult1(String str) {
		return str.length()+1;
	}
	
	
	public static Integer printResultStatic(String str) {
		return str.length()+1;
	}
	
	public static Integer printResultStatic1(String str) {
		return str.length()+1;
	}
	
	
	
}
