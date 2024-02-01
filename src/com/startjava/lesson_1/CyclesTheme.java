public class CyclesTheme {
	public static void main(String[] args) {
		System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int finish = 21;
        int counter = start;
        int sumEvenNums = 0;
        int sumOddNums = 0;

        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddNums += counter;
            }
        } while(++counter <= finish);

        System.out.println("В отрезке " + "[" + start + ", " + finish + "]" + 
                " сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddNums);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = -1;
        int num3 = 5;
        int max = num2;
        int min = num1;

        if (num1 > max) {
            max = num1;
        } 
        if (num3 > max) {
            max = num3;
        }
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;

        while (srcNum > 0) {
            int digit = srcNum % 10;
            System.out.print(digit);
            sum += digit;
            srcNum /= 10;
        }
        System.out.println("\nСумма его цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int count = 0;
        int size = 5;

        for (int i = 1; i < 24; ) {
            for (int j = 0; j < size; j++) {
                if (i < 24) {
                    System.out.printf("%5d", i);
                } else {
                    System.out.printf("%5d", 0);
                }
                i += 2;
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        srcNum = 3242592;
        int copySrcNum = srcNum;
        int countTwos = 0;

        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 2) {
                countTwos++;
            }
            copySrcNum /= 10;
        }

        String state = " (нечетное) ";
        if (countTwos % 2 == 0) {
            state = " (четное) ";
        }
        System.out.println("В " + srcNum + state + "количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }
        System.out.println();

        int cols = 5;
        int rows = 5;
        while (rows > 0) {
            while (cols > 0) {
                System.out.print("#");
                cols--;
            }
            System.out.println();
            rows--;
            cols = rows;
        }
        System.out.println();

        cols = 1;
        rows = 5;
        int mark = 1;

        do {
            do {
                System.out.print("$");
                cols--;
            } while (cols > 0);
            System.out.println();
            rows--;
            mark = rows > 2 ? ++mark : --mark;
            cols = mark;
        } while (rows > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s%12s%14s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 15; i <= 122; i++) {
            if (((i <= '0') && (i % 2 != 0)) || ((i >= 'a') && (i % 2 == 0))) {
                System.out.printf("%n  %-12d%-13c%s", i, i, Character.getName(i));
            }
        }

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int reverse = 0;

        while (copySrcNum > 0) {
            reverse = reverse * 10 + copySrcNum % 10;
            copySrcNum /= 10;
        }

        state = " является ";
        if (srcNum != reverse) {
            state = " не является ";
        }
        System.out.println("Число " + srcNum + state + "палиндромом");

        System.out.println("\n9. Проверка, является ли число счастливым");
        srcNum = 123321;
        int rightHalf = srcNum % 1000;
        int leftHalf = srcNum / 1000;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;

        while (leftHalf > 0) {
            sumRightHalf += rightHalf % 10;
            rightHalf /= 10;
            sumLeftHalf += leftHalf % 10;
            leftHalf /= 10;
        }

        state = " является ";
        if (sumRightHalf != sumLeftHalf) {
            state = " не является ";
        }
        System.out.println("Число " + srcNum + state + "счастливым");
        System.out.println("Сумма цифр " + (srcNum % 1000) + " = " + sumRightHalf +
                "\nСумма цифр " + (srcNum / 1000) + " = " + sumLeftHalf);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("\tТАБЛИЦА ПИФАГОРА");

        System.out.println("  |  2  3  4  5  6  7  8  9");
        System.out.println("--+------------------------");

        for (int i = 2; i <= 9; i++) {
            System.out.print(i + " |");
            for (int j = 2; j <= 9; j++ ) {
                System.out.printf("%3d", (i * j));
            }
            System.out.println();
        }
	}
}