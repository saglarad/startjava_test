import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private Player pl1;	
	private Player pl2;

	public GuessNumber(Player pl1, Player pl2) {
		this.pl1 = pl1;
		this.pl2 = pl2;
	}	

	public void start() {
		Random rnd = new Random();
		int secretNum = rnd.nextInt(100);
		Scanner console = new Scanner(System.in);

		while(true) {
			System.out.print(pl1.getName() + ", введите число: ");
		int num = console.nextInt();
		if(num == secretNum) {
			System.out.println("победил игрок " + pl1.getName());
			break;
		} else if (num > secretNum) {
			System.out.println("Введенное число больше загаданного");
		} else {
			System.out.println("Введенное число меньше загаданного");
		}

		System.out.print(pl2.getName() + ", введите число: ");
		num = console.nextInt();
		if(num == secretNum) {
			System.out.println("победил игрок " + pl2.getName());
			break;
		} else if (num > secretNum) {
			System.out.println("Введенное число больше загаданного");
		} else {
			System.out.println("Введенное число меньше загаданного");
		}
		}
	}
}