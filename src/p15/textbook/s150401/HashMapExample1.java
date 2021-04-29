package p15.textbook.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동 key가 같기 때문에 제일 마지막에 저장한 값으로 대치
		
		// 저장한 총 Entry 수 얻기
		System.out.println("총 Entry 수 : " + map.size()); // 3
		
		// 객체 찾기
		System.out.println("\t 홍길동 : " + map.get("홍길동")); // 이름(key)로 점수(값)을 검색
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		
		// 반복해서 key를 얻고 값을 Map에서 얻어냄
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동"); // key로 Map.Entry를 제거
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.EntrySet 얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		/// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		
		// 객체 전체 삭제
		map.clear(); // 모든 Map.Entry 삭제
		System.out.println("총 Entry 수 : " + map.size());
	}
}
