package com.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//list.add(new ArrayList());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		
		System.out.println(list);
		
		list.add(1,25);
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		list.remove(0);
		
		System.out.println(list);
		
		list.set(0, 75);
		
		System.out.println(list);
		
		System.out.println(list.contains(10));
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		//list.clear();
		
		System.out.println(list.isEmpty());
		
		for (int i = 0 ; i < list.size() ; i++ )
		{
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for (Integer c : list)
		{
			System.out.println(c);
		}
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		list.add(25);
		list.add(75);
		System.out.println(list);
		
		Iterator<Integer> it1 = list.iterator();
		while(it1.hasNext())
		{
			Integer t = it1.next();
			if(t % 2 == 1)
			{
				it1.remove();
			}
		}
		System.out.println(list);
	}

}
