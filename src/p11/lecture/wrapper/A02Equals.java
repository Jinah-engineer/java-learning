package p11.lecture.wrapper;

public class A02Equals {
	public static void main(String[] args) {
		
		Integer i1 = 999999999;
		Integer i2 = new Integer(999999999);
		
		int int1 = i1;
		int int2 = i2;
		
		System.out.println(int1 == int2);
		System.out.println(i1 == i2); // 참조는 같지 않다.
		System.out.println(i1.equals(i2)); // equals를 통해 실제로 가지고 있는 값인지 확인하기
		
		
	}
}
