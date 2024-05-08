package javaProject;

public class Car3 {

	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자
	Car3() {
		// 자동 생성자(매개변수가 없음)
	}

	Car3(String model) {
		this.model = model;
	}

	Car3(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car3(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
