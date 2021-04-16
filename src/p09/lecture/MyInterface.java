package p09.lecture;

public interface MyInterface {
	public static void main(final String[] args) {
		// final variable의 특성을 갖는다.
		int localVar = 3;
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(localVar);
				System.out.println(args);
			}
			
		};
	}
}
