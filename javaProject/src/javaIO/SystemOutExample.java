package javaIO;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {

		OutputStream os = System.out;

		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(10); // 아스키코드 10: 행 바꿈

		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		os.write(10);

		String hangul = "가나다라마바사아자차카타파하"; // 한글을 그대로 출력할 경우 오류
		byte[] hangulBytes = hangul.getBytes(); // 한글은 2바이트부터 시작이라 배열로 옮긴 후 출력
		os.write(hangulBytes);

		os.flush();
		
		os.close();
	}
}
