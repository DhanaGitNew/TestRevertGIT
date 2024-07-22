package com.anonymousinnerclass;

public class TestRunner {
	
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.printVal("Hello"));
		
		Behave behave = new Behave() {
			
			public String printVal(String str) {
				return str.toUpperCase();
			}
		};
		
		System.out.println(behave.printVal("Hello"));
	}

	
}
