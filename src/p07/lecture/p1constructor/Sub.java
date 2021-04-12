package p07.lecture.p1constructor;

public class Sub extends Super{
	
	public Sub(int i) {
		// 상위 클래스 생성자 호출
//		this. i = i; --> error
		super(i); // 소문자로 적어야 함
	}
}
