package com.ex;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk", "");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count);

		long c1 = strList.stream().filter(x -> x.length() > 2).count();

		System.out.println(c1);

		long c2 = strList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(c2);

		List<String> ll = strList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());

		ll.stream().forEach(e -> System.out.println(e));

		System.out.println("***********************");

		List<String> ll1 = strList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		ll1.stream().forEach(e -> System.out.println(e));
		System.out.println("***********************");

		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));

		System.out.println(G7Countries);

		System.out.println("***********************");

		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);

		List<Integer> no = numbers.stream().map(i -> i * i).collect(Collectors.toList());

		no.stream().forEach(e -> System.out.println(e));
		System.out.println("***********************");
		
		List<Integer> primes = Arrays.asList(2, 3, 5,29, 7,23, 11, 13, 17, 19); 
		IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
		//soting
		List<Integer>  bb=(List<Integer>) primes.stream().sorted().collect(Collectors.toList());;
		
		bb.stream().forEach(e -> System.out.println(e));
		
		
		System.out.println("***********************");
		System.out.println(stats);
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getAverage());
		
		System.out.println("***********************");

	}

}
