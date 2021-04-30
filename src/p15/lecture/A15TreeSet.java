package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(100);
		set.add(50);
		set.add(200);
		set.add(30);
		set.add(300); // auto boxing
		
		for (int n : set) { // auto unboxing
			System.out.println(n);
		}
		
		System.out.println("제일 낮은 객체를 리턴 : " + set.first());
		System.out.println("제일 높은 객체를 리턴 : " + set.last());
		
		System.out.println("주어진 객체보다 바로 아래 객체를 리턴 : " + set.lower(210));
		System.out.println("주어진 객체보다 바로 위의 객체를 리턴 : " + set.higher(210));
		
		System.out.println("내림차순 탐색하기");
		Iterator<Integer> di = set.descendingIterator();
		
		while (di.hasNext()) {
			System.out.println(di.next());
		}
	}
}
