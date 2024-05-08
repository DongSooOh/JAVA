package javaAPI;

import java.io.IOException;

public class KeyboardToStringIOExceptionExample {
	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];

		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo - 2); // (문자열로 변환할 바이트 배열, 변환을 시작할 인덱스, 변환할 바이트 수)
		// -2를 하는 이유는 마지막에 입력된 Enter 키에 해당하는 두 개의 바이트(캐리지 리턴과 라인 피드)를 제외하기 위함
		System.out.println(str);
	}
}
