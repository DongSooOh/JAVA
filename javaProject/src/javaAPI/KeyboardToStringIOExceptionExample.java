package javaAPI;

import java.io.IOException;

public class KeyboardToStringIOExceptionExample {
	public static void main(String[] args) throws IOException {

		byte[] bytes = new byte[100];

		System.out.println("�Է�: ");
		int readByteNo = System.in.read(bytes);

		String str = new String(bytes, 0, readByteNo - 2); // (���ڿ��� ��ȯ�� ����Ʈ �迭, ��ȯ�� ������ �ε���, ��ȯ�� ����Ʈ ��)
		// -2�� �ϴ� ������ �������� �Էµ� Enter Ű�� �ش��ϴ� �� ���� ����Ʈ(ĳ���� ���ϰ� ���� �ǵ�)�� �����ϱ� ����
		System.out.println(str);
	}
}
