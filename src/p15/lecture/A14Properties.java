package p15.lecture;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws Exception {
		
		// 파일 시스템 경로를 이용해서 Properties 객체 생성하기
		Properties props = new Properties();
		String path = "bin/p15/lecture/config1.properties";
		
		props.load(new FileReader(path));
		
		System.out.println(props.get("id"));
		System.out.println(props.get("password"));
		
		String idValue = (String) props.get("id"); // 위험한 코드! 
		String value = props.getProperty("id");
	}
}
