package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {

	public static void main(String[] args) {
		// GCD : 최대공약수
		// Greatest Common divisor

		Scanner scanner = new Scanner(System.in);

		System.out.println("두 수를 입력하세요~");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		System.out.println("입력 받은 두 수는 " + num1 + "과 " + num2);

		// 최대 공약수를 출력하는 코드 작성 1

		for (int i = num1; i >= 1;) {
			//			if ((num1 % i) == 0 && (num2 % i) == 0) {
			//				System.out.println("최대공약수는: " + i);
			//				return;
			//			}

			// 최대 공약수를 출력하는 코드 작성 2
			
			

			if (num2 % i == 0) {
				System.out.println("최대공약수는: " + i);
				return;
			} else {
				int temp = i;
				i = num2 % i;
				num2 = temp;
//				if (num2 % r == 0) {
//					System.out.println("최대공약수는: " + r);
//					return;
//				}
			}
		}
		scanner.close();

	}

}
