package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class AccumulatesNamestoList {
	
	//ToDoubleFunction<Double> todouble = (Double value)-> 0;
	

	public static void main(String[] args) {
		
		
		Person p1 = new Person("Ram", 34, "Chennai", "Yes", 100000);
		Person p2 = new Person("Sam", 35, "Chennai", "Yes", 200000);
		Person p3 = new Person("Mark", 36, "Chennai", "Yes", 300000);
		Person p4 = new Person("Adam", 37, "Chennai", "Yes", 400000);
		Person p5 = new Person("Dev", 38, "Chennai", "Yes", 500000);
		Person p6 = new Person("Mani", 39, "Chennai", "Yes", 600000);
		Person p7 = new Person("Ari", 40, "Chennai", "Yes", 700000);
		Person p8 = new Person("Ari", 40, "Chennai", "Yes", 700000);
		HR h1 = new HR();
		h1.setDept("HR");

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

		// Map is used to transform from one object to another
		// Collector callss is final and having utility methods to group the value.
		List<String> lst = personList.stream().map((x) -> x.getName().toUpperCase()).collect(Collectors.toList());
		lst.forEach(System.out::println);
		
		//public static <T> Collector<T,?,Double> averagingDouble(ToDoubleFunction<? super T> mapper)
		
		

	}
	
	
	


}
