package p03.lecture.P2Binary.p4bit;

public class A02BitShift {

	public static void main(String[] args) {
		// left shift << : 왼쪽으로 비트 이동
		// 				   (오른쪽은 0으로 채움)
		// right shift >> : 오른쪽으로 비트 이동
		//				   (왼쪽 비트는 부호 비트로 채움)
		
		// right shift >>> : 오른쪽으로 비트 이동
        //				   (왼쪽 비트는 0으로 채움)
		
		// left shift <<
		int a = 99; // 0110 0011
		// a << 1    // 1100 0110
		int b = a << 1;
		System.out.println(b); // 198, 1100 0111
		
		b = a << 2; // 01 1000 1100
		System.out.println(b); // 396
		
		// left shift ==> * 2
		
		
		// right shift >> / 2
		// a 			// 0110 0111
		// a >> 1 		// 0011 0001
		System.out.println(a >> 1); // 49
		// a >> 2 		// 0001 1000
		System.out.println(a >> 2); // 24
		
		
		
		
	}

}
