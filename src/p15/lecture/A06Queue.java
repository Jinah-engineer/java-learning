package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	// Queue interface : FIFO 자료구조에서 사용되는 메소드를 정의한다
	// Queue interface를 구현한 대표적인 class --> LinkedList
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(9);
		queue.offer(6);
		queue.offer(3);
		
		int first = queue.poll();
		
		System.out.println(first);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll()); // null
		
		queue.offer(30);
		queue.offer(10);
		queue.offer(20);
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
	}
}
