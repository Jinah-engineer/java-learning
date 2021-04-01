package p04.textbook.Excercise;

import java.util.Scanner;

public class ExcercisePractice02 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		int keyCode = scanner.nextInt();
		int money = scanner.nextInt();


		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("------------------------");
				System.out.println("선택 > ");
			}

			if (keyCode == 49) {
				balance += money;
				System.out.println("예금액> " + money);
			} 
			if (keyCode == 50) {
				balance -= money;
				System.out.println("출금액> " + money);
			} 
			else if (keyCode == 51) {
				System.out.println("잔고> " + balance);
				run = false;
			} 

		}
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
