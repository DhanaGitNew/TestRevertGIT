package com.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToCollection {
	
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
		//personList.forEach(System.out::println);
		
		System.out.println("==============================================");
		
		Set<Person> hashSet= personList.stream().collect(Collectors.toSet());
		hashSet.forEach(System.out::println);
		
		System.out.println("==============================================");
		Set<Person> linkedHashSet= personList.stream().collect(Collectors.toCollection(LinkedHashSet::new));
		linkedHashSet.forEach(System.out::println);
		
		System.out.println("==============================================");
		Set<Person> treeSet= personList.stream().collect(Collectors.toCollection(TreeSet::new));
		treeSet.forEach(System.out::println);
	}

}
