package javaProject;

public class Car7 {
	int speed;

	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	public static void main(String[] args) {
		Car7 myCar = new Car7();
		myCar.speed = 60;
		myCar.run();
	}
}
