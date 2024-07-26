package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiablelistSet {
	
	public static void main(String[] args) {
		
		List<String> unModifiableList = Arrays.asList("one","two","three","four");
		//unModifiableList.stream().collect(Collectors.toUnmodifiableList());
		
		System.out.println(unModifiableList.getClass());
		
	}

}
