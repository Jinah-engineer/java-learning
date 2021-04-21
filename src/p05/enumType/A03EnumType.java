package p05.enumType;

public class A03EnumType {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE;
		
		System.out.println(e1 instanceof MyEnum); //true
		System.out.println(e1 instanceof Object); // true
		System.out.println(e1 instanceof Enum); // true
	}
}
