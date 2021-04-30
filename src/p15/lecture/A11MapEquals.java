package p15.lecture;

import java.util.HashMap;
import java.util.Map;

public class A11MapEquals {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put(new String("java"), 99);
		map.put(new String("html"), 100);
		map.put(new String("java"), 200);
		
		System.out.println(map.size()); // 2
		System.out.println(map.get("java"));
		
		Map<Computer, Integer> map2 = new HashMap<Computer, Integer>();
		
		map2.put(new Computer(100), 30000);
		map2.put(new Computer(200), 40000);
		map2.put(new Computer(100), 70000);
		
		System.out.println(map2.size()); // 3
		System.out.println(map2.get(new Computer(100))); // null
		
	}
}

class Computer {
	private int model;
	
	public Computer(int model) {
		this.model = model;
	}

}
