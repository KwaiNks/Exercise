package com.richmondjava.intro;

import java.util.Scanner;

public class Calculator {

	private double sum;
	private double subtract;
	private double product;
	private double quotient;

	public double add(double x, double y) {
		sum = x + y;
		return sum;
	}

	public double subtract(double x, double y) {
		subtract = x - y;
		return subtract;		
	}

	public double multiply(double x, double y) {
		product = x * y;
		return product;
	}

	public double divid(double x, double y) {
		double numerator = x;
		double denomoinator = y;
		quotient = numerator / denomoinator;
		if (denomoinator == 0) {
			throw new ArithmeticException("Impossible to divid by 0");
		}
		return quotient;
	}

	public static void main(String[] args) {

		double firstValue;
		double secondValue;
		char operation;

		Calculator calculator = new Calculator(); 

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Press q to quit");
			
			System.out.print("Plese enter the operation to be performed(+, -, /, *): ");
			operation = input.next().charAt(0);
			if (operation == 'q') {
				System.out.println("See you next time!");
				System.exit(0);
			}	
			System.out.print("Please enter your first number: ");
					firstValue = input.nextDouble();

			System.out.print("Please enter your second number: ");
			secondValue = input.nextDouble();

			switch (operation) {
			case '+': 
				System.out.printf("The sum of %.2f and %.2f is %.2f ", 
						firstValue, secondValue,calculator.add(firstValue, secondValue));
				System.out.println();
				break;

			case '-':
				System.out.printf("The subtraction of %.2f and %.2f is %.2f ", 
						firstValue, secondValue,calculator.subtract(firstValue, secondValue));
				System.out.println();
				break;

			case '/':	
				System.out.printf("The division of %.2f and %.2f is %.2f ", 
						firstValue, secondValue,calculator.divid(firstValue, secondValue));
				System.out.println();
				break;

			case '*':
				System.out.printf("The multiplication of %.2f and %.2f is %.2f ", 
						firstValue, secondValue,calculator.multiply(firstValue, secondValue));
				System.out.println();
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
		} while (operation != 'q');

		input.close();
	}
}