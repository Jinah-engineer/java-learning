package p08.lecture.ex2;

public interface MyInterface {
	// public static final field (상수)
		public static final int MY_FIELD1 = 1;
		int MY_FIELD2 = 2;
		String MY_FIELD3 = "HELLO";
		// no constructor! 
		
		
		// method 
		// 1) public abstract method (instance method) *** 
		// 2) public static method (static/class method)
		// 3) public default method (instance method) 
		
		
		// Public static method
		public static void staticMethod1() {
			System.out.println("static method1");
		}
		static void statieMethod2() {
			System.out.println("static method2");
		}
		
		// Public abstract method
		public abstract void method1();
		void method2();
		
		
		// Public default method
		public default void defaultMethod1() {
			System.out.println("default method1()");
		}
		
		default void defaultMethod2() {
			System.out.println("default method2()");
		}
		
		
}
