package com.anonymousinterface;

public class TestRunner {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		System.out.println(person.behave("Hello"));
		
		Behave person1 = new Person();
		System.out.println(person1.behave("HelloWorld"));
		
		Behave behave = new Behave() {
			
			@Override
			public String behave(String str) {
				// TODO Auto-generated method stub
				return str.toUpperCase();
			}
		};
		
		System.out.println(behave.behave("Interface invoke"));
	}

}
