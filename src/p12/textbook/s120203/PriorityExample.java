package p12.textbook.s120203;

public class PriorityExample {
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			// 스레드 이름
			Thread thread = new CalcThread("thread" + i);
			
			if (i != 10) {
				// 가장 낮은 우선순위 설정
				thread.setPriority(thread.MIN_PRIORITY);
			} else {
				// 가장 높은 우선순위 설정
				thread.setPriority(thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}
}
