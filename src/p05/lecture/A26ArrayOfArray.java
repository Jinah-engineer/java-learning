package p05.lecture;

import java.util.Arrays;

public class A26ArrayOfArray {
	// 그림: 10. 배열의 배열.png
	public static void main(String[] args) {
		
		int[][] arr = new int[2][]; // 2개의 배열 with null (아무것도 참조하지 않기 때문에)
		
		System.out.println("arr 길이: " + arr.length);
		for (int[] a : arr) {
			System.out.println(a);
		}
		
		// 각 원소 할당
		arr[0] = new int[3];
		arr[1] = new int[2];
		
		// 길이
		System.out.println("arr[0] 길이: " + arr[0].length);
		System.out.println("arr[0] 길이: " + arr[1].length);
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}

}
