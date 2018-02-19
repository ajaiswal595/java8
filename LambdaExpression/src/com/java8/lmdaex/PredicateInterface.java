package com.java8.lmdaex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PredicateInterface {

	public static void main(String[] args) {
/*		Predicate<String> p1 = s-> s.length()<20;
		Predicate<String> p2 = s-> s.length()>10;
		Predicate<String> p3 = p1.and(p2);
*/

		List<String> string =  Arrays.asList("one","two","three","four","five");
		
		List<String> result = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		
		string.forEach(c1);
		
		//Consumer<String> c2 = s -> result.add(s);
		Consumer<String> c2 = result::add;
		
		System.out.println(result.size()); //size would be 0
		
		string.forEach(c1.andThen(c2));
		
		System.out.println(result.size()); // size would be 5
		
		
		
	}

}
