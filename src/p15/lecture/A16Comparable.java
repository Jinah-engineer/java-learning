package p15.lecture;

import java.util.TreeSet;

public class A16Comparable {
	public static void main(String[] args) {
		
		TreeSet<Car> set = new TreeSet<Car>();
		set.add(new Car(100));
		set.add(new Car(200));
		set.add(new Car(50));
		set.add(new Car(150));
		
		System.out.println(set);
		
		Car c1 = new Car(50);
		Car c2 = new Car(150);
		
		System.out.println(c1.compareTo(c2));
		System.out.println(c2.compareTo(c1));
		System.out.println(c2.compareTo(c2));
	}
}

class Car implements Comparable<Car>{
	private int model;
	
	public Car (int model) {
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
	
	

	// Comparable interface를 구현할 때, 반드시 compareTo 메소드 재정의하기
	@Override
	public int compareTo(Car param) {
		// this가 param보다 크면 양수 +
		// this가 param보다 작으면 음수 -
		// this가 param과 같으면 0 
		return this.model - param.model;
	}
}