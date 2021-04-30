package p99;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		Integer r = map.put(1,1);
		System.out.println(r);
		System.out.println(map.get(1));
		
		r = map.put(1, 3);
		System.out.println(r);
		System.out.println(map.get(1));
	}
}
