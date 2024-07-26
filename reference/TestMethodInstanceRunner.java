package com.Method.reference;

public class TestMethodInstanceRunner {

	
	public void speak() {
		System.out.println("From Method Ref instance");
	}
	
	public static void main(String[] args) {
		
		Person person = ()-> 
				System.out.println("From Interface Ref instance");
		person.speak();
		
		TestMethodInstanceRunner testMethodInstanceRunner = new TestMethodInstanceRunner();
		
		Person person2 = testMethodInstanceRunner::speak;
		person2.speak();
		
	}
}
