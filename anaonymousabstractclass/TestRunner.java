package com.anaonymousabstractclass;

public class TestRunner {
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.print("Hello"));
		System.out.println(person.print1("WORLD"));
		
		Behave behave = new Behave() {
			
			@Override
			public String print1(String str) {
				
				return str.toLowerCase();
			}
		};
		
		System.out.println(behave.print1("HELLO WORLD"));
		
	}

}
