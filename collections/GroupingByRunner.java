package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GroupingByRunner {
	
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

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5, p6, p7,p8);
		//Set<Person> personSet= new HashSet<Person>();
		/*
		 * Set<Person> personSet = new TreeSet<>();
		 * 
		 * personSet.add(p1); personSet.add(p2); personSet.add(p3); personSet.add(p4);
		 * personSet.add(p5); personSet.add(p6); personSet.add(p7); personSet.add(p8);
		 */
		
		Map<String, List<Person>> mp=personList.stream().filter(x->x.getAge()>38).collect(Collectors.groupingBy(Person::getName));
		System.out.println(mp);
		
		Map<String, Long> mp1=personList.stream().filter(x->x.getAge()>38).collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
		System.out.println(mp1);
		
		Map<String, Long> mp2=personList.stream().filter(x->x.getAge()>38).collect(Collectors.groupingBy(Person::getName, TreeMap::new, Collectors.counting()));
		System.out.println(mp2);
		
	}

}
