package com.java8.streamapi;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("one","two","three","four","five");
		 
		Predicate<String> p1 = s->s.length()>3;
		// s is instance 
		
		// stream.forEach(s-> System.out.println(s)); //outcome will be //one two three four five
		
	/*	stream.filter(p1).
		forEach(s-> System.out.println(s)); // outcome will be three four five
		*/
		
		
		//predicate is having and ,or, equal 
		Predicate<String> p2 = Predicate.isEqual("two");
		
		stream.filter(p2.or(p1)).
		forEach(s-> System.out.println(s)); // outcome will be three four five

	}

}
