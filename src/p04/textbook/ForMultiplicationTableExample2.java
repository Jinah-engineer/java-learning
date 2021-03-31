package p04.textbook;

public class ForMultiplicationTableExample2 {

	public static void main(String[] args) {
		
		// 별 트리 -! -! -! -! 
		// 1. 왼쪽 정렬 트리
		// 2. 역 트리
		// 3. 오른쪽 정렬 역 트리
		// 4. 오른쪽 정렬 트리
		// 필요한 method : 
		
		System.out.println("------------------------");
		System.out.println("새로운 줄"); // enter o 
		System.out.println("새로운 줄"); 
		System.out.print("같은 줄"); // enter x 
		System.out.print("같은 줄");
		System.out.println();		
		System.out.println("------------------------");

		// 왼쪽 정렬 별트리
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");

		// 역 트리
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");

		// 오른쪽 정렬 역트리
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");

		// 오른쪽 정렬 트리
		for (int i = 0; i < 5; i++) {
			for (int k = 4; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
	}
}
