package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingandThen {

	public static void main(String[] args) {

		Person p1 = new Person("Ram", 34, "Chennai", "Yes", 100000);
		Person p2 = new Person("Sam", 35, "Chennai", "Yes", 200000);
		Person p3 = new Person("Mark", 36, "Chennai", "Yes", 300000);
		Person p4 = new Person("Adamdd", 37, "Chennai", "Yes", 400000);
		Person p5 = new Person("Devdd", 38, "Chennai", "Yes", 500000);
		Person p6 = new Person("Maniffff", 39, "Chennai", "Yes", 600000);
		Person p7 = new Person("Ari", 40, "Chennai", "Yes", 700000);
		Person p8 = new Person("Ari", 40, "Chennai", "Yes", 80000);

		// collectingandthen

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		/*
		 * List<String> unmodifiableList = personList.stream().map(Person::getName)
		 * .collect(Collectors.collectingAndThen(Collectors.toList(),
		 * Collections::unmodifiableList)); System.out.println(unmodifiableList);
		 * 
		 * List<Integer> list = Arrays.asList(1, 2, 3);
		 * 
		 * Boolean empty =
		 * list.stream().collect(Collectors.collectingAndThen(Collectors.toList(),
		 * List::isEmpty));
		 * 
		 * System.out.println(empty);
		 * 
		 * String s=personList.stream().map((x) ->
		 * x.getName()).sorted(Comparator.comparing(String::length).reversed()).
		 * findFirst().orElse("No"); System.out.println(s);
		 * 
		 * 
		 * 
		 * String n = personList.stream().map((x) ->
		 * x.getName()).collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator
		 * .comparing(String::length)), w -> w.orElse("?"))); System.out.println(n);
		 * 
		 * 
		 * Long i
		 * =personList.stream().map(Person::getAge).collect(Collectors.counting());
		 * System.out.println(i);
		 * 
		 * Map<String,Long>
		 * result=personList.stream().filter((v)->v.getAge()>37).collect(Collectors.
		 * groupingBy(Person::getName,Collectors.counting()));
		 * System.out.println(result);
		 */
		
		// 
		
		Map<Integer,Person> mp1=personList.stream().collect(Collectors.toMap(Person::getSalary, Function.identity()));
		System.out.println(mp1);
		
		Map<String,Person> mp=personList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(obj1,obj2)->obj2));
		System.out.println(mp);
		
		Map<String,Person> mp2=personList.stream().collect(Collectors.toMap(Person::getName, Function.identity(),(obj1,obj2)->obj2,LinkedHashMap::new));
		System.out.println(mp2.getClass());
		System.out.println(personList.getClass());
		List<Person> linkedList=personList.stream().collect(Collectors.toCollection(LinkedList::new));
		System.out.println(linkedList.getClass());
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,1);
		Predicate<Integer> pr =  (Integer t) -> { return t.equals(2) ;};
		
       Stream<Integer> b= l1.stream().distinct();
       
       b.forEach(System.out::println);
       
       
       
	}

}
