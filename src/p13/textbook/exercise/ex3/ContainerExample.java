package p13.textbook.exercise.ex3;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}

class Container<K, V> {
	private K field1;
	public K getKey() {
		return field1;
	}
	
	
	private V field2;
	public V getValue() {
		return field2;
	}
	
	public void set(K field1, V field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
}
