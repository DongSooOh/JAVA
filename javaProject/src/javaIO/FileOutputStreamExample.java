package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception {

		// ������ ���� ��� �� �̸� ����
		String originalFileName = "C:/web/javaProject/src/javaIO/jjava.jpg";
		// ����� ������ ��� �� �̸� ����
		String targetFileName = "C:/Temp/jjava.jpg";

		// ���� �Է� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream(originalFileName);
		// ���� ��� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream(targetFileName);

		int readByteNo;
		// ���� �迭 ����
		byte[] readBytes = new byte[100];
		// ���� �б� �� ���� ����
		while ((readByteNo = fis.read(readBytes)) != -1) {
			// ���� ����Ʈ�� ��� ��Ʈ���� ����
			fos.write(readBytes, 0, readByteNo);
		}

		// ��� ��Ʈ�� ���� ����
		fos.flush();
		// ���� ��� ��Ʈ�� �ݱ�
		fos.close();
		// ���� �Է� ��Ʈ�� �ݱ�
		fis.close();

		System.out.println("���簡 �ߵǾ����ϴ�.");
	}
}