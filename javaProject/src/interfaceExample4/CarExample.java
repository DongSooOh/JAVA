package interfaceExample4;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire(); // �� �������� ��ȣ�� ����
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
	}
}
