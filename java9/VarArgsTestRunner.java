package com.java9;

public class VarArgsTestRunner {
	
	
	public static void main(String[] args) {
		
		m1("greet");
		m5("greet",1);
		m5("greet",1,2);
		m5("greet",1,2,3);
	}
	
	public static void m1(String str) {
		System.out.println(str.toUpperCase());
	}
	
	
	public static void m5(String str, int... n1) {
		System.out.println(str.toUpperCase());
		for (int i : n1) {
			System.out.println(i);
		}
	}
	
	
	/*
	 * public static void m2(String str, int n1) {
	 * System.out.println(str.toUpperCase()); }
	 * 
	 * public static void m3(String str,int n1,int n2) {
	 * System.out.println(str.toUpperCase()); }
	 * 
	 * public static void m4(String str,int n1,int n2,int n3) {
	 * System.out.println(str.toUpperCase()); }
	 */

}
