package com.functionalInterface;

public class TestRunner {
	
	public static void main(String[] args) {
		Person person = new Person() {
			
			@Override
			public void printName() {
				System.out.println("Print Obj");
				
			}
		};
		
		person.printName();
		Behave per= new Behave() {

			@Override
			public void printName() {
				// TODO Auto-generated method stub
				
			}
			
		};
		System.out.println(per.printResult("Hi"));
	}

}
