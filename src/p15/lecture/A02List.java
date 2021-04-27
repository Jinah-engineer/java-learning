package p15.lecture;

import java.util.ArrayList;
import java.util.List;

public class A02List {
	// List : 순서가 있고 중복 저장 가능
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add : 값 추가
		list.add("java");
		list.add("spring");
		list.add("python");
		
		// size : 크기
		int len = list.size();
		System.out.println(len);
		
		// get : 꺼내기
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		// for 탐색
		System.out.println("for 탐색");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for 탐색
		System.out.println("향상된 for 탐색");
		for (String string : list) {
			System.out.println(string);
		}
		
		// remove: 삭제
		list.add("servlet");
		System.out.println("지우기 전에 탐색을 시작합니다.");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove(3);
		System.out.println("지운 후에 탐색을 시작합니다.");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.remove("java");
		System.out.println("java 글자위치를 삭제해봅니다.");
		for (String string : list) {
			System.out.println(string);
		}
	}
}
