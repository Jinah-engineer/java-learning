package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		
	Malamute d1 = new Malamute();
	d1.bark();
	d1.sit();
	d1.pull();
	
	Pet p1 = d1; // Pet interface 변수에 Malamute 할당
	p1.sit();
//	p1.bark(); - KindaDog class 불가
//	p1.pull(); - SledDog interface 불가
	
	SledDog s1 = d1;
	s1.pull();
//	s1.sit();
//	s1.bark();
	
	KindaDog k1 = d1;
	k1.bark();
//	k1.sit();
//	k1.pull();
	
	Malamute d2 = (Malamute) k1; // type casting 
	d2.bark();
	d2.sit();
	d2.pull();
	
	Wolf w1 = (Wolf) k1; // compile error and program stop
	w1.bark();

	System.out.println("오류가 없습니다.");
	
	
	}
}
