package p06.lecture.p8access_modifier.package1;

public class MyClass01 {
	// field
	public int i;
	private int j;
	int k; //default or package private (어떤 키워드도 없음)
	
	public static int a;
	private static int b;
	static int c;
	
	public MyClass01() {
		
	}
	
	private	MyClass01(int i) {
		
	}
	
	MyClass01(int i, int j) {
		
	}
	
	private void method1() {
		
	}
	
	public void method2() {
		
	}
	
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
