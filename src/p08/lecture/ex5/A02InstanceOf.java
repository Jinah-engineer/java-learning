package p08.lecture.ex5;

public class A02InstanceOf {
	public static void main(String[] args) {
		
		KindaDog d1 = new Malamute();
		
		// 실제 instance가 어떤 타입인지 
		System.out.println(d1 instanceof KindaDog); // true
		System.out.println(d1 instanceof Malamute); // true
		System.out.println(d1 instanceof Pet); // true
		System.out.println(d1 instanceof SledDog); // true
		System.out.println(d1 instanceof Wolf); // false
		
		// true의 경우 type casting 가능
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog) d1;
//		Wolf w1 = (Wolf) d1; --> exception 
		
		System.out.println("오류가 없으므로 프로그램을 종료합니다.");
	}
}
