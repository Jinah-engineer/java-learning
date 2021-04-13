package p07.lecture.p6polymorphism.ex2;

public class A07ClassCastException {
	public static void main(String[] args) {
		
		KindaCat k1 = new Tiger();
		
		Tiger T1 = (Tiger) k1;
//		Cat c1 = (Cat) k1; --> exception
//		k1은 tiger를 참조하는 객체이기 때문이다.
		
		System.out.println("프로그램 종료...");
	}
}
