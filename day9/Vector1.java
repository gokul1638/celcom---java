package com.day9;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector <Integer> vec = new Vector<>(3,2);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(10);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(30);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(40);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(50);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(60);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(70);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		Enumeration<Integer> e = vec.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
