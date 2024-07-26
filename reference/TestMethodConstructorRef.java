package com.Method.reference;

public class TestMethodConstructorRef {
	
	public TestMethodConstructorRef() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		Person person=TestMethodConstructorRef::new;
		person.speak();
	}

}
