package p07.lecture.p6polymorphism.ex2;

public class A08InstanceOf {
	public static void main(String[] args) {
		// instanceOf : 결과 - boolean type
		// 좌항 : 참조 변수 / 우항 : type
		// 참조변수가 가리키는 인스턴스가 우항 type이면 true
		// 그렇지 않으면 false
		
		KindaCat k1 = new Tiger();
		System.out.println(k1 instanceof Tiger); // true
		System.out.println(k1 instanceof KindaCat); // true
		System.out.println(k1 instanceof Cat); // false 
		
		System.out.println();
		KindaCat k2  =  new KindaCat();
		System.out.println(k2 instanceof KindaCat); // true
		System.out.println(k2 instanceof Tiger); // false
		System.out.println(k2 instanceof Cat); // false
		
		Tiger t1 = (Tiger) k1;
		
		if (k1 instanceof Cat) {
			Cat c1 = (Cat) k1;
		}
		
 		System.out.println("프로그램 종료.");
	}
}
