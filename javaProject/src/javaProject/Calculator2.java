package javaProject;

public class Calculator2 {

	// 필드
	// 생성자
	// 메소드
	int plus(int x, int y) { // avg() 메소드에서 호출됨
		int result = x + y;
		return result; // 값 반환: 호출한 avg() 메소드의 plus(x, y)로 result 값 반환
	}

	double avg(int x, int y) { // execute() 메소드에서 호출됨
		double sum = plus(x, y); // plus() 메소드 호출/ 반환된 result 값을 sum에 대입
		double result = sum / 2;
		return result;
	}

	void execute() { // Calculator2Example 클래스(실행 클래스)에서 호출
		double result = avg(7, 10); // avg() 메소드 호출 / avg() 메소드의 result 값 반환하여 result에 대입
		println("실행결과: " + result); // println() 메소드 호출
		// println() 메소드에서 반환된 문자열을 Calculator2Example 클래스의 호출한 곳으로 반환
	}

	void println(String message) { // execute() 메소드에서 호출됨
		System.out.println(message); // ("실행결과: " + result) 문자열 반환
	}
}
