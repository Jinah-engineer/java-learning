package p15.textbook.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // Java는 한번만 저장됨
		set.add("iBATIS");
		
		// 저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// 반복자 얻기
		Iterator<String> iterator = set.iterator();
		// 객체 수 만큼 루핑
		while (iterator.hasNext()) {
			// 한 개의 객체를 가져온다.
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		
		// 한 개의 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());

		// 반복자 얻기
		iterator = set.iterator();
		// 객체 수 만큼 루핑
		while (iterator.hasNext()) {
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
