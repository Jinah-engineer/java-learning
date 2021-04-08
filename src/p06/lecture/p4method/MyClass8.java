package p06.lecture.p4method;

public class MyClass8 {
	// 아무것도 넣지 않았을 때는 0을 리턴
	// 그 외에는 최대값 리턴
	
	int maxMethod(int...values) {
		if (values.length == 0 ){
			return 0;
		} 
		
		int max = values[0];
		
		for (int i = 1; i < values.length; i++) {
			if (max < values[i]) {
				max = values[i];
			}
		}
		return max;
		
			
	}
}
