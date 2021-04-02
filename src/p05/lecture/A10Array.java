package p05.lecture;

import java.util.Arrays;

public class A10Array {
	// 그림: 06.배열.png
	public static void main(String[] args) {
		
		// array (배열) : 여러 개의 값을 갖는 자료형
		
		int i;
		i = 5;
		
		int[] arr; // int 배열 - 참조타입
		arr = new int[3]; // 3개의 데이터를 담겠다.!
		
		arr[0] = 5;
		arr[1] = 7;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// 한번에 출력
		System.out.println(Arrays.toString(arr));
		
	}

}
