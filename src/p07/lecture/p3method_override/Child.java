package p07.lecture.p3method_override;

public class Child extends Parent{
	@Override // annotation 사용 가능
	public void method1() {
		// 재정의 - 메소드의 이름, parameter가 같은 조건에서 가능하다. 
		super.method1();
		System.out.println("method1 - child");
	}
}
