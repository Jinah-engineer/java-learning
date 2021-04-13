package p07.lecture.p6polymorphism.ex2;

public class A05Parameter {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		
		method(k1);
		
		KindaCat k2 = new Tiger();
		
		method(k2);
		
		Tiger t = new Tiger();
		
		method(t);
		
		Cat c = new Cat();
		
		method(c);
		
		method(new Cat());
		method(new Tiger());
		
		// 배열에 넣어도 되고,
		// parameter에 넣어도 되고,
		// 직접 instance를 parameter에 넣어도 되고
		
	}
	
	public static void method(KindaCat k) {
		k.cry();
	}
}
