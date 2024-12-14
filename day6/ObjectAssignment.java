package com.day6;

public class ObjectAssignment {
	
	int a = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectAssignment obj1 = new ObjectAssignment();
		ObjectAssignment obj2 = obj1;
		
		obj1.a = 10;
		
		System.out.println(obj2.a);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
