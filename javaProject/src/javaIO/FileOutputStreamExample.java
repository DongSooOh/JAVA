package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {

		// 파일의 원본 경로 및 이름 지정
		String originalFileName = "C:/web/javaProject/src/javaIO/jjava.jpg";
		// 복사된 파일의 경로 및 이름 지정
		String targetFileName = "C:/Temp/jjava.jpg";

		// 파일 입력 스트림 생성
		FileInputStream fis = new FileInputStream(originalFileName);
		// 파일 출력 스트림 생성
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		// 버퍼 배열 생성
		byte[] readBytes = new byte[100];
		// 파일 읽기 및 복사 진행
		while ((readByteNo = fis.read(readBytes)) != -1) {
			// 읽은 바이트를 출력 스트림에 쓰기
			fos.write(readBytes, 0, readByteNo);
		}

		// 출력 스트림 버퍼 비우기
		fos.flush();
		// 파일 출력 스트림 닫기
		fos.close();
		// 파일 입력 스트림 닫기
		fis.close();

		System.out.println("복사가 잘되었습니다.");
	}
}