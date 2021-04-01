package p05.lecture;

public class A05StringLiteral {
	
	// 그림 : 04.String.png
	public static void main(String[] args) {

		String s = new String("java");
		String t = "java";
		String u = "java"; // 이전 String t값을 재참조하게 된다. 
	
		// string은 new string을 쓰지 않아도 객체 참조가 된다. 
		
		System.out.println(s == t); // false
		System.out.println(t == u); // true
		
		
	}

}
