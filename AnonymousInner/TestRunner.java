package com.AnonymousInner;

public class TestRunner {
	
	
	
	public static void main(String[] args) {
		Behave behave= new Behave() {
			
			@Override
			public String greet(String str) {
				
				return str.toUpperCase();
			}
		};
		Person person = new Person();
		System.out.println(person.callBehave(behave, "HelloGreet"));
	}
	

}
