package p15.lecture.sample;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05List {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(4, 6, 9, 10);
		List<Integer> list2 = Arrays.asList(-3, -8, -10, -99);
		List<Integer> list3 = Arrays.asList(8888, 9999, 222, 111);
		List<Integer> list4 = Arrays.asList(3030, 223, 123);

		//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>(); // 위와 결과는 같음

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);

		int max = max(list);
		System.out.println(max);

		max = max2(list);
		System.out.println(max);

		List<Integer> flatList = flat(list);
		System.out.println(flatList.size());
		System.out.println(flatList.get(1));


	}
	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<Integer>();
		
		for (List<Integer> sub : list) {
			for (Integer item : sub) {
				flat.add(item);
			}
		}
		return flat;
	}
	// 향상된 for문을 이용한 메소드
	private static int max2(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (List<Integer> sub : list) {
			for (int item : sub) {
				if (item > max) {
					max = item;
				}
			}
		}

		return max;
	}

	// for문을 이용한 max 구하는 메소드
	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			List<Integer> sublist = list.get(i);

			for (int j = 0; j < sublist.size(); j++) {
				int item = sublist.get(j);

				if (item > max) {
					max = item;
				}
			}
		}
		return max;
	}
}
