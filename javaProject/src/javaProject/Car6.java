package javaProject;

public class Car6 {

	// 필드
	String model;
	int speed;

	// 생성자
	Car6(String model) {
		this.model = model;
	}

	// 메소드
	void setSpeed(int speed) { // set-()는 필드랑 관련이 있음 + 값을 저장해야 하므로 매개변수가 있어야 함
		this.speed = speed;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
		}
	}
}
