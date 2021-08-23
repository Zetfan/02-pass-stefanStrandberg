package com.test.testreport._pass_stefanStrandberg;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Random;

public class CalculatorTest {
	Random rand = new Random();
	BasicCalculator BC = new BasicCalculator();
	AdvancedCalculator AC = new AdvancedCalculator();
	
	@Test
	public void additionTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = firstNumber + secondNumber;
		
		assertEquals(BC.addition(firstNumber, secondNumber),result, 0);
		
		System.out.println("Addition test");
		System.out.println(firstNumber);
		System.out.println("+");
		System.out.println(secondNumber);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	@Test
	public void subtractionTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = firstNumber - secondNumber;
		
		assertEquals(BC.subtraction(firstNumber, secondNumber),result, 0);
		
		System.out.println("Subtraction test");
		System.out.println(firstNumber);
		System.out.println("-");
		System.out.println(secondNumber);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	@Test
	public void multiplicationTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = firstNumber * secondNumber;
		
		assertEquals(BC.multiplication(firstNumber, secondNumber),result, 0);
		
		System.out.println("Multiplication test");
		System.out.println(firstNumber);
		System.out.println("*");
		System.out.println(secondNumber);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void divisionTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = firstNumber / secondNumber;
		
		assertEquals(BC.division(firstNumber, secondNumber),result, 0);
		
		System.out.println("Division test");
		System.out.println(firstNumber);
		System.out.println("/");
		System.out.println(secondNumber);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void squareTest() {
		double number = (rand.nextDouble() *-10 + rand.nextDouble() *10);
		double result = number * number;
		
		assertEquals(AC.square(number),result, 0);
		
		System.out.println("Square test");
		System.out.println(number);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void maxTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = Math.max(firstNumber, secondNumber);
		
		assertEquals(AC.max(firstNumber, secondNumber),result, 0);
		
		System.out.println("Max test");
		System.out.println(firstNumber);
		System.out.println("vs");
		System.out.println(secondNumber);
		System.out.println("max =");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void minTest() {
		double firstNumber = (rand.nextDouble() *-10);
		double secondNumber = (rand.nextDouble() *10);
		double result = Math.min(firstNumber, secondNumber);
		
		assertEquals(AC.min(firstNumber, secondNumber),result, 0);
		
		System.out.println("Min test");
		System.out.println(firstNumber);
		System.out.println("vs");
		System.out.println(secondNumber);
		System.out.println("min =");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void remainderTest() {
		double dividend = (rand.nextDouble() *-10);
		double divisor = (rand.nextDouble() *10);
		double result = dividend % divisor;
		
		assertEquals(AC.remainder(dividend, divisor),result, 0);
		
		System.out.println("Remainder test");
		System.out.println(dividend);
		System.out.println("%");
		System.out.println(divisor);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}
	
	@Test
	public void sinusTest() {
		double number = (rand.nextDouble() *-10 + rand.nextDouble() *10);
		double result = Math.sin(number);
		
		assertEquals(AC.sinus(number),result, 0);
		
		System.out.println("Sinus test");
		System.out.println(number);
		System.out.println("=");
		System.out.println(result);
		System.out.println("");
	}

}
