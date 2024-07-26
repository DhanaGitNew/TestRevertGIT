package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MappingRunner {

	public static class Mobile implements Comparable<Mobile> {

		private String mobileName;
		private String mobileModel;
		private int price;
		private String Ram;
		private String pixel;

		public Mobile(String mobileName, String mobileModel, int price, String ram, String pixel) {
			super();
			this.mobileName = mobileName;
			this.mobileModel = mobileModel;
			this.price = price;
			Ram = ram;
			this.pixel = pixel;
		}

		public String getMobileName() {
			return mobileName;
		}

		public String getMobileModel() {
			return mobileModel;
		}

		public int getPrice() {
			return price;
		}

		public String getRam() {
			return Ram;
		}

		public String getPixel() {
			return pixel;
		}

		@Override
		public String toString() {
			return "Mobile [mobileName=" + mobileName + ", mobileModel=" + mobileModel + ", price=" + price + ", Ram="
					+ Ram + ", pixel=" + pixel + "]";
		}

		@Override
		public int compareTo(Mobile o) {

			return this.getMobileName().compareTo(o.getMobileName());
		}

	}

	public static void main(String[] args) {

		// Mobile mobile1= new Mobile("SAMSUNG", "123", 12000, "2GB", "5");
		// Mobile mobile1= new Mobile("SAMSUNG", "123", 12000, "2GB", "5");
		Mobile mobile2 = new Mobile("SAMSUNG", "123", 12000, "2GB", "5");
		Mobile mobile3 = new Mobile("SONY", "234", 15000, "7GB", "22");
		Mobile mobile4 = new Mobile("LAVA", "567", 9000, "6GB", "22");
		Mobile mobile5 = new Mobile("IPHONE", "876", 120000, "8GB", "33");
		Mobile mobile6 = new Mobile("VIVO", "988", 30000, "3GB", "67");
		Mobile mobile7 = new Mobile("RELIANCE", "999", 25000, "2GB", "34");
		Mobile mobile8 = new Mobile("ONEPLUS", "000", 45000, "4GB", "20");
		// Mobile mobile9= new Mobile("ONEPLUS", "000", 45000, "4GB", "20");

		List<Mobile> mobileList = Arrays.asList(mobile2, mobile3, mobile4, mobile5, mobile6, mobile7, mobile8);
		/*
		 * Map<String,Set<Mobile>> finallist=
		 * mobileList.stream().collect(Collectors.groupingBy(Mobile::getMobileName,
		 * Collectors.toCollection(TreeSet::new))); System.out.println(finallist);
		 * 
		 * 
		 * Map<String, Set<String>> val=
		 * mobileList.stream().collect(Collectors.groupingBy(Mobile::getMobileName,
		 * Collectors.mapping(Mobile::getMobileModel, Collectors.toSet())));
		 * System.out.println(val);
		 * 
		 * Optional<Integer> mb=
		 * mobileList.stream().collect(Collectors.mapping(Mobile::getPrice,
		 * Collectors.minBy(Comparator.naturalOrder()))); System.out.println(mb.get());
		 * 
		 * Predicate<Mobile> pred= new Predicate<MappingRunner.Mobile>() {
		 * 
		 * @Override public boolean test(Mobile t) {
		 * 
		 * return t.getMobileName().length()>4; } }; Map<Boolean, List<String>>
		 * partList=
		 * mobileList.stream().collect(Collectors.partitioningBy(pred,Collectors.mapping
		 * (Mobile::getMobileName, Collectors.toList())));
		 * partList.entrySet().stream().forEach((x)->System.out.println("Key : "+" "+x.
		 * getKey()+" "+"Value : "+ x.getValue()));
		 * 
		 * Map<String, Optional<Mobile>> mn=
		 * mobileList.stream().collect(Collectors.groupingBy(Mobile::getMobileName,
		 * Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(Mobile::
		 * getPrice))))); System.out.println(mn);
		 * 
		 * 
		 * mobileList.stream().collect(Collectors.toMap(Mobile::getMobileName,Collectors
		 * .toList())); System.out.println(mx);
		 */

	}

}
