public class VariableTheme {
	public static void main(String[] args) {
		System.out.println("Расчет стоимости товара со скидкой");
		int penPrice = 100;
		int bookPrice = 200;
		int totalPrice = penPrice + bookPrice;
		double discount = totalPrice * 0.11;
		System.out.println(totalPrice);
		System.out.println(discount);
		System.out.println(totalPrice - discount);

		System.out.println("\nВывод слова JAVA");
		System.out.println("   J    a  v     v  a      ");
		System.out.println("   J   a a  v   v  a a     ");
		System.out.println("J  J  aaaaa  V V  aaaaa    ");
		System.out.println(" JJ  a     a  V  a     a   ");

		System.out.println("\nВывод min и max значений целых числовых типов");
		byte byteMax = Byte.MAX_VALUE;
		short shortMax = Short.MAX_VALUE;
		char charMax = Character.MAX_VALUE;
		int intMax = Integer.MAX_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("Исходное значение byte: " + byteMax +
                "\nПосле инкремента: " + ++byteMax +
                "\nПосле декремента: " + --byteMax);
		System.out.println("Исходное значение short: " + shortMax +
                "\nПосле инкремента: " + ++shortMax +
                "\nПосле декремента: " + --shortMax);
		System.out.println("Исходное значение char: " + (int) charMax +
                "\nПосле инкремента: " + (int) ++charMax +
                "\nПосле декремента: " + (int) --charMax);
		System.out.println("Исходное значение int: " + intMax +
                "\nПосле инкремента: " + ++intMax +
                "\nПосле декремента: " + --intMax);
		System.out.println("Исходное значение long: " + longMax +
                "\nПосле инкремента: " + ++longMax +
                "\nПосле декремента: " + --longMax);

		System.out.println("\nПерестановка значений переменных");
		int a = 2; 
		int b = 5;
		System.out.println("a. С помощью третьей переменной");
		System.out.println("Исходные значения: a = " + a + "; b = " + b);
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("После перестановки: a = " + a + "; b = " + b);

		System.out.println("\nb. С помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + "; b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("После перестановки: a = " + a + "; b = " + b);

        System.out.println("\nc. С помощью побитовой операции ^");
        System.out.println("Исходные значения: a = " + a + "; b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("После перестановки: a = " + a + "; b = " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';

        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';

        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = srcNum / 10 % 10;
        int ones = srcNum % 10;

        System.out.println("Число " + srcNum + " содержит:" +
                "\n сотен - " + hundreds +
                "\n десятков - " + tens +
                "\n единиц - " + ones);
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones) +
                "\nПроизведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = totalSeconds / 60 % 60;
        int ss = totalSeconds % 60;
        System.out.println(hh + ":" + mm + ":" + ss); 

  
	}
}