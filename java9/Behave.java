package com.java9;

public interface Behave {
	
	
	public default  String converttoUppercase() {
		return upper();
		
	}
	
	public static  String converttoUppercase1() {
		return upper();
		
	}
	
	private static String upper() {
		return "Hello World";
	}

}
