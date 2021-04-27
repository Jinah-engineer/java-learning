package p15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayList {
	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 100;
		arr1[2] = 101;
		
		arr1 = Arrays.copyOf(arr1, 4);
//		arr1[3] = 102;
		
		System.out.println(Arrays.toString(arr1));
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(99);
		list.add(100);
		
		
	}
}
