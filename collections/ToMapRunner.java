package com.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapRunner {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Ram", 34, "Chennai", "Yes", 100000);
		Person p2 = new Person("Sam", 35, "Chennai", "Yes", 200000);
		Person p3 = new Person("Mark", 36, "Chennai", "Yes", 300000);
		Person p4 = new Person("Adam", 37, "Chennai", "Yes", 400000);
		Person p5 = new Person("Dev", 38, "Chennai", "Yes", 500000);
		Person p6 = new Person("Mani", 39, "Chennai", "Yes", 600000);
		Person p7 = new Person("Ari", 40, "Chennai", "Yes", 700000);
		Person p8 = new Person("Ari", 40, "Chennai", "Yes", 800000);

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		
		Map<Integer,Person> toMapWithUniqueKey= personList.stream().collect(Collectors.toMap(Person::getSalary, Function.identity()));
		System.out.println(toMapWithUniqueKey);
		
		
		Map<String,Person> toMapUsingMergeFunction= personList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(key1,key2)->key2));
		System.out.println(toMapUsingMergeFunction);
		System.out.println(toMapUsingMergeFunction.getClass());
		
		//Map<String,Person> toMapUsingMergeFnThrowException= personList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(key1,key2)-> {throw new IllegalArgumentException("Duplicate key '" + key1 + "'.");}));
		//System.out.println(toMapUsingMergeFnThrowException);
		
		Map<String,Person> tomapWithFinalRsLinked= personList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(key1,key2)->key2,LinkedHashMap::new));
		System.out.println(tomapWithFinalRsLinked);
		System.out.println(tomapWithFinalRsLinked.getClass());
		
	}

}
