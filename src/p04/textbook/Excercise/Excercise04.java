package p04.textbook.Excercise;

public class Excercise04 {

	public static void main(String[] args) {
		
		
//		int num1 = (int)(Math.random() * 6) + 1;
//		int num2 = (int)(Math.random() * 6) + 1;
//		System.out.println(num1 + ", " + num2);
//		
//		while (true) {
//			if (num1 + num2 == 5) {
//				System.out.println("실행 중단");
//				break;
//			}
//		}
		
		int d1 = 0;
		int d2 = 0;
		
		do {
			d1 = (int)(Math.random() * 6) + 1;
			d2 = (int)(Math.random() * 6) + 1;
			
			System.out.println("(" + d1 + ", " + d2 + ")");
		} while ((d1 + d2) != 5);
	}

}
