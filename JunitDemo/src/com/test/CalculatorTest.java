package com.test;

import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.day13.Calculator;

public class CalculatorTest {
	
	int input1;
	int input2;
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
		input1 = 10;
		input2 = 20;
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
		int expected = 30;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubraction() {
		System.out.println("Test subraction");
		int actual = calc.Subraction(input1, input2);
		int expected = -10;
		assertEquals(expected, actual);
	}

}
