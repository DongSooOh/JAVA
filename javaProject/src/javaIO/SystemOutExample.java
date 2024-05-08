package javaIO;

import java.io.OutputStream;

public class SystemOutExample {
	public static void main(String[] args) throws Exception {

		OutputStream os = System.out;

		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(10); // �ƽ�Ű�ڵ� 10: �� �ٲ�

		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		os.write(10);

		String hangul = "�����ٶ󸶹ٻ������īŸ����"; // �ѱ��� �״�� ����� ��� ����
		byte[] hangulBytes = hangul.getBytes(); // �ѱ��� 2����Ʈ���� �����̶� �迭�� �ű� �� ���
		os.write(hangulBytes);

		os.flush();
		
		os.close();
	}
}
