package p06.lecture.p3constructor;

public class A04Overloading {

	public static void main(String[] args) {
		// 생성자는 하나 이상 있어야 된다
		// 파라미터의 타입, 개수, 순서에 의해 구분된다
		Computer com1 = new Computer("dell", 4, "intel", 128);
		Computer com2 = new Computer("hp", 8, "amd", 256);
		
		Computer com3 = new Computer("lenovo", 8, "intel");
		Computer com4 = new Computer("ms", 16);
		
		System.out.println(com3.ssd);
		System.out.println(com4.cpu); // field에 값을 할당하지 않기 때문에 default 값이 나온다. 
		System.out.println(com4.ssd);
	}

}
