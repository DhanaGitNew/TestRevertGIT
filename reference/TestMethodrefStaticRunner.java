package com.Method.reference;

public class TestMethodrefStaticRunner {
	
	public static void speak() {
		System.out.println("From Method Ref");
	}
	
	public static void main(String[] args) {
		
		Person person = ()-> 
				System.out.println("From Interface Ref");
		person.speak();
		
		Person person2 = TestMethodrefStaticRunner::speak;
		person2.speak();
		
	}

}
