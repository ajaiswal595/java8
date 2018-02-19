package com.java8.lmdaex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

class Customer {
	public String name;
	
	public Customer(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
public class MethodReference {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		Consumer<String> c1 = System.out::println;
		//both above are equivalent
		
		Comparator<Integer> ci =(i1, i2)->Integer.compare(i1,i2);
		Comparator<Integer> ci1 = Integer::compare;
		//both above are equivalent
		
		/*
		 *  :: is known as method reference introduced in java8
		 */
		
		List<Customer> list = Arrays.asList(new Customer("Ajay"),new Customer("Sandeep"),new Customer("Mohan"));
	                          //Consumer type
		list.forEach(custoer -> System.out.println(custoer));
		                 //2nd way
		System.out.println("-------------------<>-------------<>----------------------");
		list.forEach(System.out::println);
	}

}
