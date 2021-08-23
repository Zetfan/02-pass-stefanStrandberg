package com.test.testreport._pass_stefanStrandberg;

public class Main {

	public static void main(String[] args) {
		
		BasicCalculator BC = new BasicCalculator();
		AdvancedCalculator AC = new AdvancedCalculator();
		
		System.out.println("Addition");
		System.out.println(BC.addition(13, 37));
		
		System.out.println("Subtraction");
		System.out.println(BC.subtraction(50, 25));
		
		System.out.println("Multiplication");
		System.out.println(BC.multiplication(5, 20));
		
		System.out.println("Division");
		System.out.println(BC.division(250, 100));
		
		System.out.println("Square");
		System.out.println(AC.square(25));
		
		System.out.println("Max");
		System.out.println(AC.max(25, 45));
		
		System.out.println("Min");
		System.out.println(AC.min(453, 345));
		
		System.out.println("Remainder");
		System.out.println(AC.remainder(12, 150));
		
		System.out.println("Sinus");
		System.out.println(AC.sinus(12345));
		
	}

}
