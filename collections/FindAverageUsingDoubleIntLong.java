package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class FindAverageUsingDoubleIntLong {

	public static void main(String[] args) {

		List<Double> dblValues = new ArrayList<Double>();
		dblValues.add(1.1);
		dblValues.add(2.2);
		dblValues.add(3.3);
		dblValues.add(4.4);
		dblValues.add(5.5);
		dblValues.add(6.6);

		// Averaging double

		Double dk = dblValues.stream().collect(Collectors.averagingDouble((f) -> f));
		System.out.println(dk);

		List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 5);

		ToIntFunction<Integer> intFunction = new ToIntFunction<Integer>() {

			@Override
			public int applyAsInt(Integer value) {

				return value;
			}
		};

		int ik = intValues.stream().collect(Collectors.averagingInt(intFunction)).intValue();

		System.out.println(ik);

		List<Long> longValues = Arrays.asList(1L, 2L, 3L, 4L, 5L);

		Long f = longValues.stream().collect(Collectors.averagingLong(Long::longValue)).longValue();

		System.out.println(f);
		
		java.util.function.Function<String, Integer> func =  new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		
		//intValues.stream().collect(Collectors.collectingAndThen(downstream, finisher));

	}

}
