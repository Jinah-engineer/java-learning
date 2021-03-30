package p03.textbook.excercise;

public class Excercise02 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		x++;
		int z = (++x) + (y--);
		y--;
		
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		
		
	}
	
}
