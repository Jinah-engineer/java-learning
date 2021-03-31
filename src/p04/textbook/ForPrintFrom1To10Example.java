package p04.textbook;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		
		// 1 ~ 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1 ~ 10 홀수만
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 1 ~ 10 짝수만
		for (int i = 2; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 10 ~ 1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 10 ~ 1 짝수만
		for (int i = 10; i > 0; i-=2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// 10 ~ 1 홀수만
		for (int i = 9; i > 0; i-=2) {
			System.out.println(i);
		}
	}	

}
