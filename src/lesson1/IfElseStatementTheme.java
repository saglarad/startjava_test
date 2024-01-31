public class IfElseStatementTheme {
	public static void main(String[] args) {
		System.out.println("1. Перевод псевдокода на язык Java");

		boolean man = false;
		int age = 30;
		double height = 1.70;
		char firstLetter = "Mio".charAt(0);

		if(!man) {
			System.out.println("man");
		} else {
			System.out.println("woman");
		}	
		if(age > 18) {
			System.out.println("big");
		} else {
			System.out.println("small");
		}
		if(height < 1.8) {
			System.out.println("short");
		} else {
			System.out.println("tall");
		}
		
		if (firstLetter == 'M') {
			System.out.println("Max");
		} else if (firstLetter == 'I') {
			System.out.println("Igor");
		} else {
			System.out.println("anotherName");
		}

		System.out.println("\n2.Поиск большего числа");
		int a = 2;
        int b = 3;

        if (a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(b + " > " + a);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int srcNum = 22;

        if (srcNum == 0) {
            System.out.println(srcNum);
        } else {
            System.out.print(srcNum + " является ");

            if (srcNum > 0) {
                System.out.print("положительным и ");
            } else {
                System.out.print("отрицательным и ");
            }

            if (srcNum % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }

            System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 456;

        boolean isEqualOnes = (num1 % 10) == (num2 % 10);
        boolean isEqualTens = (num1 / 10 % 10) == (num2 / 10 % 10);
        boolean isEqualHundreds = (num1 / 100) == (num2 / 100);

        if (!isEqualOnes && !isEqualTens && !isEqualHundreds) {
            System.out.println("В числах нет равных разрядов");
        } else {
            System.out.println("В числах " + num1 + " и " + num2 + " одинаковые цифры в разрядах:");
            if (isEqualOnes) {
                System.out.println("1 = " + num1 % 10);
            }
            if (isEqualTens) {
                System.out.println("2 = " + num1 / 10 % 10);
            }
            if (isEqualHundreds) {
                System.out.println("3 = " + num1 / 100);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char someChar = '\u0031';
        System.out.print("Символ " + someChar + " является ");

        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("маленькой буквой");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("большой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("цифрой");
        } else {
            System.out.println("ни буквой ни цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int percent = 10;

        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit <= 300_000) {
            percent = 7;
        }
        double interest = deposit / 100 * percent;

        System.out.println("Сумма вклада: " + deposit +
                "\nСумма начисленного %: " + interest +
                "\nИтоговая сумма с %: " + (deposit + interest));

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;

        if (historyPercent > 91) {
            historyGrade = 5;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        }

        int csPercent = 92;
        int csGrade = 2;

        if (csPercent > 91) {
            csGrade = 5;
        } else if (csPercent > 73) {
            csGrade = 4;
        } else if (csPercent > 60) {
            csGrade = 3;
        }

        System.out.println("История - " + historyGrade + "\n" +
                "Программирование - " + csGrade +
                "\nСредний балл оценок по предметам - " + ((historyGrade + csGrade) / 2f) +
                "\nСредний % по предметам - " + ((historyPercent + csPercent) / 2f));

        System.out.println("\n8. Расчет годовой прибыли");
        int rent = 5_000;
        int costPrice = 9_000;
        int revenue = 13_000;

        int profit = 12 * (revenue - costPrice - rent);
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
        }

	}
}