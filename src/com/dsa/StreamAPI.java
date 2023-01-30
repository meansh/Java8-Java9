package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(47, 8, 1, 9, 7, 6, 10);
		
				

		
		
		
		
		
		nums.stream().
		filter( n ->n%2==1).
		sorted().
		map(n -> n*2).
		forEach(n -> System.out.println(n));
		
		
		
		
		
		
		
		
		
		
		//Stream<Integer> data = nums.stream();
		//Stream<Integer> mappedData = data.map(n -> n*2);
		// mappedData.forEach(n -> System.out.println(n));
		
	}
}
