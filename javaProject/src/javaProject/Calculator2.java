package javaProject;

public class Calculator2 {

	// �ʵ�
	// ������
	// �޼ҵ�
	int plus(int x, int y) { // avg() �޼ҵ忡�� ȣ���
		int result = x + y;
		return result; // �� ��ȯ: ȣ���� avg() �޼ҵ��� plus(x, y)�� result �� ��ȯ
	}

	double avg(int x, int y) { // execute() �޼ҵ忡�� ȣ���
		double sum = plus(x, y); // plus() �޼ҵ� ȣ��/ ��ȯ�� result ���� sum�� ����
		double result = sum / 2;
		return result;
	}

	void execute() { // Calculator2Example Ŭ����(���� Ŭ����)���� ȣ��
		double result = avg(7, 10); // avg() �޼ҵ� ȣ�� / avg() �޼ҵ��� result �� ��ȯ�Ͽ� result�� ����
		println("������: " + result); // println() �޼ҵ� ȣ��
		// println() �޼ҵ忡�� ��ȯ�� ���ڿ��� Calculator2Example Ŭ������ ȣ���� ������ ��ȯ
	}

	void println(String message) { // execute() �޼ҵ忡�� ȣ���
		System.out.println(message); // ("������: " + result) ���ڿ� ��ȯ
	}
}
