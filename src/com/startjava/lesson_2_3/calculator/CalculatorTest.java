package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();

		System.out.println("Калькулятор запущен!");
		
		String answer = "y";
		while(answer.equals("y")) {
			System.out.print("Введите первое число: ");
			int firstNumber = scanner.nextInt();
			calc.setFirstNumber(firstNumber);

			System.out.print("Введите знак математической операции:");
			String text = scanner.next();
			char mathOperation = text.charAt(0);
			calc.setMathOperation(mathOperation);

			System.out.print("Введите второе число: ");
			int secondNumber = scanner.nextInt();
			calc.setSecondNumber(secondNumber);

			calc.calculate();

			do {
				System.out.print("Хотите продолжить? [y/no]: ");
				answer = scanner.next();
			} while(!answer.equals("y") && !answer.equals("no"));	

		}
		System.out.println("Калькулятор закрылся!");			
	}
}