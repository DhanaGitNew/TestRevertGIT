package com.sortcomparableRunner;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ComparableRunner {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> intList = Arrays.asList(3,4,2,1);
		Stream<Integer> st= intList.stream().sorted();
		st.forEach(ComparableRunner::getVal);
		
		System.out.println("===================================================");
		// Reversed
		Stream<Integer> st1= intList.stream().sorted(Comparator.reverseOrder());
		st1.forEach(ComparableRunner::getVal);
		
		
		
	}

	public static void getVal(Integer in) {
		System.out.println(in);
	}
}
