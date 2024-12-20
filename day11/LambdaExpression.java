package com.day11;

@FunctionalInterface
interface Functional {
	int calc(int a, int b);
}

public class LambdaExpression {

//	public int Addition(int a, int b)
//	{
//		return a+b;
//	}
//	public int Subraction(int a,  int b)
//	{
//		return a-b;
//	}

	public static void main(String[] args) {
		Functional ref = (a, b) -> a + b;

		System.out.println(ref.calc(10, 30));
		System.out.println(ref.calc(20, 50));

		ref = (a, b) -> a - b;
		System.out.println(ref.calc(50, 40));

		ref = (a, b) -> a * b;
		System.out.println(ref.calc(10, 20));

		ref = (a, b) -> a / b;
		System.out.println(ref.calc(20, 5));

	}

}
