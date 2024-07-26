package com.java9;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionFactoryRunner {
	
	public static void main(String[] args) {
		
		String[] x= {"1","2","3","4","5","6","7","8","9","10","11"};
		List<String> l1 = Arrays.asList("1","2");
		List<String> l2 = Arrays.asList("3","4");
		
		/*
		 * List<List<String>> listOfValues=List.of(l1,l2); for (List<String> string :
		 * listOfValues) { for(String st: string) { System.out.println(st); } }
		 */
		
		Map<String, Integer> mp = Map.of("Test1", 1, "Test2", 2);
		Set<Map.Entry<String, Integer>> fg= mp.entrySet();
		Iterator<Entry<String, Integer>> itr= fg.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> k= itr.next();
			System.out.println(k.getKey());
			System.out.println(k.getValue());
			
	}

}
}
