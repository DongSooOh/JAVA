package javaExample;

public class Car {

	// �ʵ�
	public int speed;

	// �޼ҵ�
	public void speedUp() {
		speed += 1;
	}

	public void start() {
		System.out.println("���");
	}
	
	// final �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}