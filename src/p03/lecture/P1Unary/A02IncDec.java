package p03.lecture.P1Unary;

public class A02IncDec {
	public static void main(String[] args) {
		// 증가 연산자
		// ++ : 변수에 1더한 값을 다시 변수에 할당
		
		int x = 5;
		x++;
		System.out.println(x);
		
		// 감소 연산자
		// -- : 변수에 1뺀 값을 다시 변수에 할당
		x--;
		System.out.println(x);
		
		/////////////////////
		// 연산자 앞에 있을 때 - 먼저 더한다!
		++x;
		System.out.println(x); // 6 
		
		int y = 5 + (++x);
		System.out.println(y); // 5 + (1 + 6) = 12
		
		
		/////////////////////
		// 연산자가 뒤에 있을 때 - 다른 연산을 한 이후에 연산(증감)이 된다.
		System.out.println(x); // 7
		
		y = 5 + (x++);
		System.out.println(y); // 5 + 7 = 12
		System.out.println(x); // 8
		
		// 따라사 가능한한 복잡하게 작성하지 않도록 한다. 최대한 효율적으로 명확하게! 
	}
}













