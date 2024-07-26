package com.Inbuilt.FunctionalInterface;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class TestSupplierRunner {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 100;
		System.out.println(supplier.get());

		IntSupplier intSupplier = () -> 100;
		DoubleSupplier doubleSupplier =()->100.00;
		
		System.out.println(doubleSupplier.getAsDouble());

	}

}
