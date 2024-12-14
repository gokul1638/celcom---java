package com.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Raj
{
	void myMethod() throws FileNotFoundException
	{
		FileReader fr = new FileReader("gokul.txt");
	}
	void Method1()
	{
		try {
			myMethod();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("hi");
		}
	}
}

public class Throws {
	
	

	public static void main(String[] args) {
		Raj ref = new Raj();
		ref.Method1();

	}

}
