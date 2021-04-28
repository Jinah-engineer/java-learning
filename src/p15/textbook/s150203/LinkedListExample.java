package p15.textbook.s150203;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// ArrayList와 LinkedList에 10000개의 객체를 삽입하는데 걸린 시간 측정
		// 실행 결과 : LinkedList가 훨씬 빠른 성능
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : "  + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + " ns");
	}
}
