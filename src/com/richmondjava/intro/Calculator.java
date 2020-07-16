package com.richmondjava.intro;

public class Calculator {

	public static void main(String[] args) {
		
		double x = 4; //variable assigned to our first value to be added
		double y = 7; //variable assigned to our second value to be added

		String operation = "/";
		switch (operation) {
		case "+": 
			double add = x + y;
			System.out.printf("The sum of %.2f and %.2f is %.2f ", x, y, add);
			break;
		case "-":
			double sub = x - y;
			System.out.printf("The subtraction of %.2f and %.2f is %.2f ", x, y, sub);
			break;
		case "/":
			double div = x / y;
			System.out.printf("The division of %.2f and %.2f is %.2f ", x, y, div);
			break;
		case "*":
			double mult = x * y;
			System.out.printf("The multiplication of %.2f and %.2f is %.2f ", x, y, mult);
			break;

		default:
			System.out.println("Invalid input");
			break;
		}	
}
}
