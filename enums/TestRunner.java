package com.enums;

public class TestRunner {
	
	public static void main(String[] args) {
		
		/*
		 * Settings[] str= Settings.values(); for (Settings settings : str) {
		 * System.out.println(settings.ordinal()); }
		 */
		Settings s1= Settings.PATH;
		System.out.println(printVal(s1));
	}
	
	public static String printVal(Settings set) {
		
		String x=null;
		switch (set) {
		case FILE_NAME:
			x="Hello";
			break;
		case PATH:
			x="Hello World";
			break;
		case FROM_URL:
			x="Hello Bean";
			break;
			

		default:
			x="No case match";
			break;
		}
		return x;
		
	}

}
