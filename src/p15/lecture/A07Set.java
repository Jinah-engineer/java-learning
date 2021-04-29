package p15.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A07Set {
	// Set : 순서 없고, 중복이 불가하다
	public static void main(String[] args) {
		
	Set<Integer> set = new HashSet<Integer>();

	set.add(9);
	set.add(8);
	set.add(2);
	
	System.out.println(set.size());
	
	set.add(9); // 첫째 9가 두번째 9로 대체된다.
	
	System.out.println(set.size());
	
	boolean c = set.contains(9);
	System.out.println(set.contains(3));
	System.out.println(c);
	
	set.remove(9);
	System.out.println(set.size());
	
	// Iterator - 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자
	Iterator<Integer> iterator = set.iterator();
	
	Integer i1 = iterator.next();
	Integer i2 = iterator.next();
	
	
	while (iterator.hasNext()) {
		Integer integ = iterator.next();
		System.out.println(integ);
	}
	
	}
}
