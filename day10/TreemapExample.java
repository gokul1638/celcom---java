package com.day10;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemapExample {

	public static void main(String[] args) {
		Map <Integer,String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(1, "gokul");
		map.put(2,"null");
		map.put(3, "hello");
		
		System.out.println(map);
		map.put(4, "learn");
		map.put(50, "ram");
		
		System.out.println(map);
		//map.remove(null);
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.containsKey(2));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.containsValue("gokul"));
		
		Set<Integer> keys = map.keySet();
		
		System.out.println(keys);
		for (Integer c : keys)
		{
			System.out.println(c + "==>" + map.get(c));
		}
		
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext())
		{
			Integer key =it.next();
			System.out.println(key + "==>" + map.get(key));
		}
		
		Set <Entry<Integer,String>> entry = map.entrySet();
		
		for(Entry<Integer,String> i : entry )
		{
			System.out.println(i.getKey() + "==>" + i.getValue());
		}
		
		Iterator<Entry<Integer , String>> it1 = entry.iterator();
		while(it1.hasNext())
		{
			Entry<Integer,String> entries = it1.next();
			System.out.println(entries.getKey() + "==>" + entries.getValue());
		}

	}

}