package p15.lecture;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class A10HashTable {
	// HashMap과 동일한 내부 구조 + key로 사용할 객체는 hashCode()와 equals()메소드를 재정의해서 동등 객체가 될 조건을 정해야 함
	// synchronized method로 구성되어있음
	// thread safe --> vector와 비슷
	
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new Hashtable<Integer, Integer>();
		
		map2.put(3, 99);
		map2.put(4, 16);
		map2.put(5, 25);
		
		System.out.println(map2.size());
		
		map2.put(3, 9);
		
		System.out.println(map2.size());
		
		System.out.println(map2.get(3));
		
		Set<Map.Entry<Integer, Integer>> entrySet = map2.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() +  ":"  + entry.getValue());
		}
		
	}
}
