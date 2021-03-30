package p03.lecture.P2Binary.p5assign;

public class A01Assignment {

	public static void main(String[] args) {
		// = : 오른쪽 값을 왼쪽에 할당 (대입)
		
		int a = 3;
		
		// += : 오른쪽과 왼쪽값을 더해서 왼쪽에 할당
		
		a += 5;
		System.out.println(a);
		
		String s = "java";
		s += "script";
		System.out.println(s);
		
		// *= : 왼쪽 값과 오른쪽 값을 곱해서 왼쪽에 할당
		a *= 6;
		System.out.println(a);
		
		// /= : 왼쪽 값을 오른쪽 값으로 나눈 결과를 왼쪽에 할당
		a /= 3;
		System.out.println(a);
		
		// %= : 왼쪽 값을 오른쪽 값으로 나눈 나머지를 왼쪽에 할당
		a %= 5;
		System.out.println(a);
			
	}

}
