package p11.textbook.exercise.ex11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		
		// byte단위까지는 가능하기 때문에 결과가 다른 것. but 그저 equals 메소드를 사용하자. 
	}
}
