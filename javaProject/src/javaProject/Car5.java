package javaProject;

public class Car5 {

	// 필드
	int speed;

	// 생성자(기본 생성자)

	// 메소드
	int getSpeed() { // 마지막으로 실행 클래스에서 호출
		return speed; // 마지막 i 값' 50' 반환
	}

	void keyTurnOn() { // 최초 실행 클래스에서 호출됨
		System.out.println("키를 돌립니다."); // 해당 문자열 출력
	}

	void run() { // 이후 실행 클래스에서 호출됨
		for (int i = 10; i <= 50; i += 10) {
			speed = i; // i는 10, 20, 30, 40, 50 값이 대입
			System.out.println("달립니다.(시속: " + speed + "km/h)"); // 각 i의 값의 수 만큼 출력
		}
	}
}
