package p15.lecture.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06Set {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4, 5, 2, 3};
		int[] arr2 = {1, 2, 3, 4};
		
		int sum1 = sum(arr1);
		int sum2 = sum(arr2);
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

	private static int sum(int[] arr2) {
		Set<Integer> set = new HashSet<Integer>();
		for (int n : arr2) {
			set.add(n);
		}
		int result = 0;
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			result += iterator.next();
		}
		return result;
	}
}
