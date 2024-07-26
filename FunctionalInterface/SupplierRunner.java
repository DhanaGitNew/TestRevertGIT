package com.functionalInterface;

import java.util.function.Supplier;

public class SupplierRunner {
	
	public static void main(String[] args) {
		
		Supplier<Integer> supplier= () -> 2*2;
		System.out.println(supplier.get());
		
	
	}

}
