package interfaceExample4;

public class CarExample {
	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire(); // 앞 바퀴들은 금호로 변경
		myCar.frontRightTire = new KumhoTire();

		myCar.run();
	}
}
