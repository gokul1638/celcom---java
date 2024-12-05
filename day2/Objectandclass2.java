package com.day2;

class Mobile
{
	String Brand;
	String Model;
	int Ram;
	int Storage;
	float price;
	
	Mobile(String brand,String model,int ram,int storage,float price)
	{
		this.Brand=brand;
		this.Model=model;
		this.Ram=ram;
		this.Storage=storage;
		this.price=price;
	}
	
	void display()
	{
		System.out.println("brand :" + Brand);
		System.out.println("Model :" + Model);
		System.out.println("RAM :" + Ram);
		System.out.println("Storage :" + Storage);
		System.out.println("price :" + price);
		
	}
	
	
}
public class Objectandclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile praveen = new Mobile("oneplus","12R",12,256,60000);
		praveen.display();
		
		Mobile pragathy = new Mobile("oneplus","nord",8,128,20000);
		pragathy.display();

	}

}
