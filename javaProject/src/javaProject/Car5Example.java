package javaProject;

public class Car5Example {
	public static void main(String[] args) {

		Car5 myCar = new Car5(); // ���̺귯�� Ŭ���� Car5�� �⺻ ������ ȣ��

		myCar.keyTurnOn(); // Car5 Ŭ������ keyTurnOn() �޼ҵ� ȣ��
		myCar.run(); // Car5 Ŭ������ run() �޼ҵ� ȣ��

		int speed = myCar.getSpeed(); // ���̺귯�� Ŭ������ getSpeed() �޼ҵ� ȣ��
		System.out.println("���� �ӵ�: " + speed + "km/h");
	}
}
