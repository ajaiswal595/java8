package com.java8.lmdaex;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}

		};

		List<String> list = Arrays.asList("*****", "**", "****", "*");
		Collections.sort(list, comp);
		
		for(String s : list){
			System.out.println(s);
		}
	
	/*
	 * With the help of lambda
	 * 
	 * 
	 */
	
	//We can write lambda experssion without providing type in parameter
	// Comparator<String> comparatorLambdaExp = ( o1,  o2) ->Integer.compare(o1.length(), o2.length());
		
		Comparator<String> comparatorLambdaExp = (String o1, String o2) ->Integer.compare(o1.length(), o2.length());
		

	List<String> list1 = Arrays.asList("*****", "**", "****", "*");
	Collections.sort(list1, comparatorLambdaExp);
	
	for(String s : list1){
		System.out.println(s);
	}
	
	}
}
