package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
	// 키는 중복 저장 가능
	// 값은 중복 저장 불가 x
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	map.put(2, 99);
	map.put(3, 6);
	map.put(8, 77);
	
	System.out.println(map.size());
	
	map.put(8, 88);
	
	System.out.println(map.get(2));
	System.out.println(map.get(8));
	
	Set<Integer> keys = map.keySet();
	
	for (Integer key : keys) {
		System.out.println(key + ":" + map.get(key));
	}
	
	map.remove(8);
	System.out.println(map.size());
	
	
	Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
	
	for (Map.Entry<Integer, Integer> entry : entries) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	}
}
