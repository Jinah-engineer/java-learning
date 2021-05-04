package p18.lecture.stream;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		Writer wt = new FileWriter(file);
		
		String line = "";
		
		while (!line.equals("종료")) {
			System.out.println("입력 >> ");
			line = scanner.nextLine();
			wt.write(line + "\n");
			
		}
		
		
		scanner.close();
		wt.close();
		
	}
}
