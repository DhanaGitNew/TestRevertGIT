package com.anonymousinterface;

public class Person implements Behave {

	@Override
	public String behave(String str) {

		return str.toUpperCase();
	}

}
