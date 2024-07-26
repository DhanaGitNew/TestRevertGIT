package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccumulatestoTreeset {

	public static void main(String[] args) {
		Person p1 = new Person("Ram", 34, "Chennai", "Yes", 100000);
		Person p2 = new Person("Sam", 35, "Chennai", "Yes", 200000);
		Person p3 = new Person("Mark", 36, "Chennai", "Yes", 300000);
		Person p4 = new Person("Adam", 37, "Chennai", "Yes", 400000);
		Person p5 = new Person("Dev", 38, "Chennai", "Yes", 500000);
		Person p6 = new Person("Mani", 39, "Chennai", "Yes", 600000);
		Person p7 = new Person("Ari", 40, "Chennai", "Yes", 700000);
		Person p8 = new Person("Ari", 40, "Chennai", "Yes", 700000);

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);

		List<String> j= new ArrayList<String>();
		
		Supplier<List<String>> s= ()->  new ArrayList<String>();
		
		
		List<String> st = personList.stream().map(Person::getName).collect(Collectors.toCollection(s));
		st.forEach(System.out::println);
		System.out.println("======================================================================");

		// To collection is also used to sum but we can add whatever the collection
		// implementation
		List<String> st1 = personList.stream().map(Person::getName).collect(Collectors.toCollection(LinkedList::new));
		st1.forEach(System.out::println);

		System.out.println("====================================================================== SET");

		// Treeset Natural Order
		Set<String> st2 = personList.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
		st2.forEach(System.out::println);
		
		System.out.println("====================================================================== LinkedHashSet");
		
		Set<String> st3 = personList.stream().map(Person::getName).collect(Collectors.toCollection(LinkedHashSet::new));
		st3.forEach(System.out::println);
		System.out.println("====================================================================== HashSet");
		
		
		Set<String> st4 = personList.stream().map(Person::getName).collect(Collectors.toCollection(HashSet::new));
		st4.forEach(System.out::println);

		
		Set<String> st5 = personList.stream().map(Person::getName).collect(Collectors.toCollection(HashSet::new));
		st4.forEach(System.out::println);

		System.out.println("====================================================================== SET");

		// Joining With delimer and perfix,suffix
		String stw = personList.stream().map(Person::getName).collect(Collectors.joining(",", "[", "]"));
		System.out.println(stw);

		char[] x = {'d', 'h', 'a', 'n', 'a','s' };

		String val = "";
		for (int i = 0; i < x.length; i++) {
			val += x[i];
		}
		
		String concat= Stream.of(x).map(String::valueOf).collect(Collectors.joining());
		System.out.println(concat);
		System.out.println(val);
		// Joining With delimer only
		String stw1 = personList.stream().map(Person::getName).collect(Collectors.joining(","));
		System.out.println(stw1);

		// Joining no delimeter direct concatenation
		String stw2 = personList.stream().map(Person::getName).collect(Collectors.joining(","));
		System.out.println(stw2);
		
		
		
		/// SET Duplicate removal
		
		Set<Person> persSet= personList.stream().filter((d)->d.getAge()>36).collect(Collectors.toSet());
		persSet.forEach(z->System.out.println(z.toString()));
		
		Set<String> persSet1= personList.stream().map(Person::getName).collect(Collectors.toSet());
		persSet1.forEach(z->System.out.println(z.toString()));
		
		
		List<Integer> l1 = Arrays.asList(1,2,3,4,5);
		
		List<String> lk= l1.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(lk);
		
		String lks= l1.stream().map(String::valueOf).collect(Collectors.joining("-"));
		System.out.println(lks);
		
	}

}
