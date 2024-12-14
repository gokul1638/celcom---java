package com.day6;

public class Garbagecollection {
	static int count = 0;
	
	Garbagecollection()
	{
		count++;
		System.out.println(count);
	}
	protected void finalize ()throws Throwable
	{
		count--;
		System.out.println(count);
	}

	public static void main(String[] args) {
		Garbagecollection obj1 = new Garbagecollection();
		Garbagecollection obj2 = new Garbagecollection();
		
		obj1=null;
		System.gc();
		obj2=null;
		System.gc();

	}

}
