package javaTest;

import java.util.Scanner; // 1. Scanner�� �ڵ� ���������� �ʾ� ����Ϸ��� import ������ ����ؾ� ��.

public class ScannerExample {
	/* 2. �߰��� ���� �޼ҵ忡 'throws Exception'���� ����ó���� ���־�� ��.(�ش� �޼ҵ尡 �߻��� �� �ִ� ��� ���ܸ� ȣ���ڿ��� �����ٴ� ���� ��Ÿ��)
	 ���ܸ� ���� �� �̰��� �ش� �޼ҵ� ������ ���ܰ� �߻��� �� �ִٴ� ���� ȣ���ڿ��� �˸��� ��
	 ȣ���ڰ� ���ܸ� ó������ ������, ���ܴ� ���� ȣ���ڷ� ���ĵ� ���̸�, ���������δ� 
	 JVM(Java Virtual Machine)�� ���� ó���� ���Դϴ�. ����, �� ����� ���ܸ� ó���ϴ� �������� 
	 ȣ���ڿ��� �ְ�, ���� ó���� ���� ���� ������ ȣ���ڿ��� ����� �� �����մϴ�. */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); //System.in: �Է�, System.out: ���
		
		System.out.println("x �� �Է�: ");
		String strX = scanner.nextLine(); // scanner.nextLine(): ���ڿ� ��ü�� ����
		int x = Integer.parseInt(strX); // �⺻ Ÿ�� value = �⺻ Ÿ��(Ŭ������).parse�⺻Ÿ��("���ڿ�");
		
		System.out.println("y �� �Է�: ");
		String strY = scanner.nextLine(); // ����ڰ� ����Ű�� ���� ������ �Է��� ���ڿ��� �а� ��ȯ
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.println("�Է� ���ڿ�: ");
			String data = scanner.nextLine(); // ����ڰ� �Է��� ���ڿ� ��ü�� data�� ��ȯ(����)
			if (data.equals("q")) { // �ش� ��ü data�� q�� �������� Ȯ��
				break; // �����ϸ� ���� ����� �ݺ���(while)�� Ż��
			}
			System.out.println("��� ���ڿ�: " + data);
			System.out.println();
		}
		System.out.println("����");
		scanner.close(); // resource leak ��� �ذ�
	}
}
