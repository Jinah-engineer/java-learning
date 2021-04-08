package p06.lecture.p4method;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		
		// arguement ~~ 2, 5 : 인수, 인자
		o1.method1(); // argument를 넣지 않아도 된다.
		o1.method2(2); // integer parameter를 넣는다.
		o1.method2(5);
		
		int x = 5;
		int y = 7;
		o1.method3(x, y);
		o1.method3(10, 20);
		
		int[] arr1 = {1, 2, 3};
		o1.method4(arr1);
		System.out.println(arr1[0]);
		
		o1.method4(new int[] {9, 8});
	}
}
