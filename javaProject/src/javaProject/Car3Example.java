package javaProject;

public class Car3Example {
	public static void main(String[] args) {

		Car3 car1 = new Car3();
		System.out.println("car1.company: " + car1.company);
		System.out.println("car1.model: " + car1.model); // �ʱⰪ: null
		System.out.println("car1.color: " + car1.color); // �ʱⰪ: null
		System.out.println("car1.maxSpeed: " + car1.maxSpeed); // �ʱⰪ: 0

		Car3 car2 = new Car3("�ڰ���");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color); // �ʱⰪ: null
		System.out.println("car2.maxSpeed: " + car2.maxSpeed); // �ʱⰪ: 0

		Car3 car3 = new Car3("Ʈ��", "�Ķ�");
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed); // �ʱⰪ: 0

		Car3 car4 = new Car3("�ý�", "����", 200);
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}
}