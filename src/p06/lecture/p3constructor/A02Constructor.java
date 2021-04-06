package p06.lecture.p3constructor;

public class A02Constructor {

	public static void main(String[] args) {
		// 클래스는 적어도 하나의 생성자를 가져야 한다
		// 만약 생성자를 직접 작성하지 않으면
		// 파라미터 없는 생성자 = argument 없는 생성자 = 기본 생성자 가 자동적으로 추가된다
		
		Student s1 = new Student();
		s1.name = "java";
		
		Student s2 = new Student("java");
		
	}

}
