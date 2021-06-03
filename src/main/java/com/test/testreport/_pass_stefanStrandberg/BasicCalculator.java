package com.test.testreport._pass_stefanStrandberg;

public class BasicCalculator implements BasicOperations {
	
	public double addition(double firstNumber, double secondNumber) {
		double result = firstNumber + secondNumber;
		return result;
	}
	
	public double subtraction(double firstNumber, double secondNumber) {
		double result = firstNumber - secondNumber;
		return result;
	}
	
	public double multiplication(double firstNumber, double secondNumber) {
		double result = firstNumber * secondNumber;
		return result;
	}
	
	public double division(double firstNumber, double secondNumber) {
		double result = firstNumber / secondNumber;
		return result;
	}

}
