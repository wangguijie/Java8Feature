package com.learn.style;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StyleLearn {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Lily", "Lucy", "Tom", "Mark");
		sortJava7(names);
		for(String name : names) {
			System.out.println(name);
		}
		
		List<String> animals = Arrays.asList("dog", "cat", "monkey", "pig");
		sortJava8(names);
		animals.forEach((animal) -> System.out.println(animal));
	}
	
	private static <T extends Comparable> void sortJava7(List<T> list) {
		Collections.sort(list , new Comparator<T>() {
			@Override
			public int compare(T t1,T t2) {
				return t1.compareTo(t2);
			}
		});
	}
	
	private static <T extends Comparable> void sortJava8(List<T> list) {
		Collections.sort(list, (s1,s2)->s1.compareTo(s2));
	}
	
}


