package javaProject;

public class Television {
	
	// �ʱ�ȭ ������ ����� �ʱ�ȭ �� �����ڸ� ���� �ʱ�ȭ �� ��� �ʱ�ȭ ������ ����
	static String company = "Samsung"; // ����� �ʱ�ȭ
	static String model = "LCD";
	static String info;	// ��� �ʱ�ȭ

	static {
		info = company + "-" + model;
	}
}
