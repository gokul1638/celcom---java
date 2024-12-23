package com.test;

import static org.junit.Assert.assertEquals;

import java.beans.ConstructorProperties;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.day13.Calculator;

@RunWith(Parameterized.class)
public class CalculatorTest1 {
	private int input1;
	private int input2;
	private int expected1;
	private int expected2;
	
	public CalculatorTest1(int input1, int input2, int expected1, int expected2)
	{
		this.input1 = input1;
		this.input2 = input2;
		this.expected1 = expected1;
		this.expected2 = expected2;
	}
	
	static Calculator calc;
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before class");
		calc = new Calculator();
	}
	
	@AfterClass
	public static void affterClass()
	{
		System.out.println("After class");
		calc = null;
	}
	@Before
	public void before()
	{
		System.out.println("Before");
//		input1 = 10;
//		input2 = 20;
	}
	
	@After
	public void after()
	{
		System.out.println("After");
		input1 = 0;
		input2 = 0;
	}

	@Test
	public void testAddition() {
		System.out.println("Test addition");
		
		int actual = calc.Addition(input1, input2);
		//int expected = 30;
		assertEquals(expected1, actual);
	}

	@Test
	public void testSubraction() {
		System.out.println("Test subraction");
		int actual = calc.Subraction(input1, input2);
		//int expected = -10;
		assertEquals(expected2, actual);
	}
	@Parameters
	public static Collection<Object[]> calculatorNumbers() {
		return Arrays.asList(new Object[][] {
			{2, 3, 5, -1},
			{4, 3, 7, 1},
			{19, 2, 21,17},
			{22, 10, 32, 12},
			{23, 7, 30, 16}
		});
	}

}
