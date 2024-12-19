package com.day10;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {

	public static void main(String[] args) {
Set<Integer> set = new LinkedHashSet<>();
		
		set.add(10);
		set.add(30);
		set.add(25);
		set.add(10);
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
		System.out.println(set.contains(10));
		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
		for(Integer c : set)
		{
			System.out.println(c);
		}
		
		Iterator<Integer> c = set.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}

	}

}
