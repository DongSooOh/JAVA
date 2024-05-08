package javaProject;

public class Car5Example {
	public static void main(String[] args) {

		Car5 myCar = new Car5(); // 라이브러리 클래스 Car5의 기본 생성자 호출

		myCar.keyTurnOn(); // Car5 클래스의 keyTurnOn() 메소드 호출
		myCar.run(); // Car5 클래스의 run() 메소드 호출

		int speed = myCar.getSpeed(); // 라이브러리 클래스의 getSpeed() 메소드 호출
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
