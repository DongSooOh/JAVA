package javaIO;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter는 한글로 된 " + "\r\n"); // \r\n: 줄 바꿈 + 맨 왼쪽으로 커서 이동
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("파일에 저장되었습니다.");
	}
}
