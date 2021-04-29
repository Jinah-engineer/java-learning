package p15.lecture.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07Map {
	public static void main(String[] args) {
		
		int[] arr1 = {1, 1, 1, 3, 3, 2, 3, 2, 1, 4, 5, 5};
		
		Map<Integer, Integer> map = count(arr1);
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	private static Map<Integer, Integer> count(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int num : arr) {
			if (map.containsKey(num)) {
				int count = map.get(num);
				map.put(num, count+1);
			} else {
				map.put(num, 1);
			}
		}
		
		return map;
	}
}
