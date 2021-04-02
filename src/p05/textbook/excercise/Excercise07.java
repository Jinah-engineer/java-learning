package p05.textbook.excercise;

public class Excercise07 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		
		// 합계
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		// 평균
		double avg = sum / (double) array.length;
		
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
