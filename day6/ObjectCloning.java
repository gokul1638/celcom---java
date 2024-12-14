package com.day6;

public class ObjectCloning  {
	int a = 20;
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		ObjectCloning obj1 = new ObjectCloning();
		
		ObjectCloning obj2 = (ObjectCloning) obj1.clone();
		
		obj1.a=50;
		System.out.println(obj2.a);
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
