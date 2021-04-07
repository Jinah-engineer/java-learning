package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	
	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	Computer (String model) {
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	Computer(int ssd, String cpu) { // 순서가 바뀌면 괜찮다.
		
	}
	
//	compile error - 같은 개수 사용할 수 없음.
//	Computer (String cpu) {
//		this.model = "hp";
//		this.memory = 4;
//		this.ssd = 128;
//	}
}
