package com.startjava.lesson_2_3.calculator;

public class Calculator{

	private int firstNumber;
	private int secondNumber;
	private char mathOperation;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setMathOperation(char mathOperation) {
		this.mathOperation = mathOperation;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public void calculate() {
		switch(mathOperation) {
		case '+':
			System.out.println(firstNumber + secondNumber);
			break;
		case '-':
			System.out.println(firstNumber - secondNumber);
			break;
		case '*':
			System.out.println(firstNumber * secondNumber);
			break;
		case '/':
			System.out.println(firstNumber / secondNumber);
			break;
		case '%':
			System.out.println(firstNumber % secondNumber);
			break;
		case '^':
			pow();
			break;
		default:
			System.out.println("Error");
		}
	}

	private void pow() {
		int result = 1;
		for (int i = 0; i < secondNumber; i++) {
			result = result * firstNumber;
		}
		System.out.println(result);	
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}
}