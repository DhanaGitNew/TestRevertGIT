package com.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateRunner {

	public static void main(String[] args) {
		BiPredicate<String, String> bipredicate = (t, u) -> t.endsWith(u);
		BiPredicate<String, String> bipredicate1 = (t, u) -> t.contains(u);

		BiPredicate<String, String> bipredicate2 = bipredicate.and(bipredicate1).negate();
		System.out.println(bipredicate2.test("Dhana", "h"));
		
		BiPredicate<String, String> bipredicate3 = bipredicate.or(bipredicate1).negate();
		System.out.println(bipredicate3.test("Dhana", "a"));
		

	}

}
