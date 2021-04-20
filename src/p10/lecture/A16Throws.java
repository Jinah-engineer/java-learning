package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A16Throws {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException | FileNotFoundException e) {
			System.out.println("예외 감지!");
		}
		
	}
	
	private static void method1() throws ClassNotFoundException, FileNotFoundException {
		Class.forName("java.lang.Number");
		FileInputStream fis = new FileInputStream("");
	}
	
	
}
