package p10.lecture;

public class A03ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		System.out.println("프로그램을 실행합니다 ~ ^_^");
		
		int[] arr1 = {3, 4, 5};
		
		int[] arr2 = {9, 8};
		
		System.out.println("arr1의 마지막 값 : " + arr1[2]);
		System.out.println("arr2의 마지막 값 : " + arr2[2]);
		
		System.out.println("프로그램이 종료되었습니다 o _ o");
	}
}
