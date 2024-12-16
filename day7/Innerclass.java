package com.day7;
interface Inner4{
	void display();
}

public class Innerclass {
	class Inner1{
		void display()
		{
			System.out.println("non - static inner class");
		}
	}
	static  class Inner2
	{
		void data()
		{
			System.out.println("Static inner class");
		}
	}

	public static void main(String[] args) {
		Innerclass ref = new Innerclass();
		Inner1 obj = ref.new Inner1();
		obj.display();
		
		Inner2 obj1 = new Innerclass.Inner2();
		obj1.data();
		
		class Inner3
		{
			void display()
			{
				System.out.println("Local inner class");
			}
		}
		Inner3 obj2 = new Inner3();
		obj2.display();
		
		Inner4 obj3 = new Inner4() {
			public void display()
			{
				System.out.println("Ananymious inner class");
			}
		};
		obj3.display();
	}

}
