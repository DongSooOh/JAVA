package javaProject;

public class Car5 {

	// �ʵ�
	int speed;

	// ������(�⺻ ������)

	// �޼ҵ�
	int getSpeed() { // ���������� ���� Ŭ�������� ȣ��
		return speed; // ������ i ��' 50' ��ȯ
	}

	void keyTurnOn() { // ���� ���� Ŭ�������� ȣ���
		System.out.println("Ű�� �����ϴ�."); // �ش� ���ڿ� ���
	}

	void run() { // ���� ���� Ŭ�������� ȣ���
		for (int i = 10; i <= 50; i += 10) {
			speed = i; // i�� 10, 20, 30, 40, 50 ���� ����
			System.out.println("�޸��ϴ�.(�ü�: " + speed + "km/h)"); // �� i�� ���� �� ��ŭ ���
		}
	}
}
