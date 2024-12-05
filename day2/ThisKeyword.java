package com.day2;

class Phone
{
	String Brand;
	String Model;
	int Ram;
	int Storage;
	float price;
	
	Phone(String brand,String model,int ram,int storage,float price)
	{
		this.Brand=brand;
		this.Model=model;
		this.Ram=ram;
		this.Storage=storage;
		this.price=price;
	}
	
	Phone()
	{
		this("oneplus","12R",12,256,35000);
		
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
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone praveen = new Phone();
		praveen.display();
		
		Phone pragathy = new Phone("oneplus","nord",8,128,20000);
		pragathy.display();

	}

}
