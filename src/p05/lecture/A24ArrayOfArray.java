package p05.lecture;

import java.util.Arrays;

public class A24ArrayOfArray {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		int[][] arr2 = new int[2][3];
		
		// 행렬 
		
		System.out.println("arr2의 길이: " + arr2.length);
		System.out.println("arr2의 인덱스 0의 길이: " + arr2[0].length);
		System.out.println("arr2의 인덱스 1의 길이: " + arr2[1].length);
		
		System.out.println();
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + ",");
			}
			System.out.println();
		}
		
		System.out.println("----------------값 변경----------------");
		
		arr2[1][1] = 9;
		arr2[0][2] = 8;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + ",");
			}
			System.out.println();
		}
		
		// Arrays.toString()
		System.out.println("----------------Arrays.toString()---------------");
		for (int[] arr : arr2) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
