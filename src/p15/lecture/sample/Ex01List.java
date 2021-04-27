package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(7, 9, -100, 30, 90, 700);
		
		System.out.println(list);
		
		int sum = sum(list);
		System.out.println(sum);
		
		int max = max(list);
		System.out.println(max);
		
		int indexOfMax = indexOfMax(list);
		System.out.println(list.get(indexOfMax));
		
		
		
	}

	private static int indexOfMax(List<Integer> list) {
		int answer = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == max(list)) {
				answer = i;
			}
		}
		return answer;
	}

	private static int max(List<Integer> list) {
		int com = Integer.MIN_VALUE;
		for (int value : list) {
			if (value > com) {
				com = value;
			}
		}
		return com;
	}

	private static int sum(List<Integer> list) {
		int sum = 0;
		for (int value : list) {
			sum += value;
		}
		return sum;
	}
	
}
