package com.test.testreport._pass_stefanStrandberg;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public double square(double number) {
		double result = number * number;
		return result;
	}

	public double max(double firstNumber, double secondNumber) {
		double result = Math.max(firstNumber, secondNumber);
		return result;
	}

	public double min(double firstNumber, double secondNumber) {
		double result = Math.min(firstNumber, secondNumber);
		return result;
	}

	public double remainder(double dividend, double divisor) {
		double result = dividend % divisor;
		return result;
	}

	public double sinus(double number) {
		double result = Math.sin(number);
		return result;
	}

}
