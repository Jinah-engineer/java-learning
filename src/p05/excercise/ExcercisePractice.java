package p05.excercise;

import java.util.Scanner;

public class ExcercisePractice {

	public static void main(String[] args) {
		// 1: 4
		// 2: 3
		// 3: 2
		// 4: 2
		// 5: 3
		// 6: 3, 5
		
		// 7: 최대값 구하기
		/*
		int max = 0;
		int[] array = {1, 5, 8, 3, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println(" max: " + max);
		*/
		
		
		
		
		// 9: 
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				studentNum = scanner.nextInt();
				System.out.println("학생수 > " + studentNum);
			} 
			
			else if (selectNo == 2) {
				scores = new int[1];
				scores[0] = scanner.nextInt();
				System.out.println("scores" + "[" + scores[0] + "]" + ">" + scores[0]);
			} 
			
			else if (selectNo == 3) {
				
			} 
			
			else if (selectNo == 4) {
				
			} 
			
			else if (selectNo == 5) {
				run = false;
			}
		}
		
		
		System.out.println("프로그램 종료.");
		
	}

}
