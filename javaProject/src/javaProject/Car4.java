package javaProject;

public class Car4 {

	// �ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;

	// ������
	Car4() { // �⺻ ������

	}

	Car4(String model) {
		this(model, null, 0);
	}

	Car4(String model, String color) {
		this(model, color, 0);
	}

	Car4(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
