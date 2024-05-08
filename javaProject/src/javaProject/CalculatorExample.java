package javaProject;

public class CalculatorExample { // 실행 클래스(main() 메소드 보유)
	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // 기본 생성자 호출
		// Calculator 클래스(라이브러리 클래스)의 객체가 생성되어 해당 클래스의 멤버인 모든 메소드들을 호출할 수 있음
		myCalc.powerOn(); // powerOn() 메소드 호출

		int result1 = myCalc.plus(5, 6); // 매개변수를 주면서 plus() 메소드 호출
		System.out.println("result1: " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // 위와 동일하게 매개변수를 던져주며 divide() 메소드 호출
		System.out.println("result2: " + result2);

		myCalc.powerOff(); // powerOff() 메소드 호출
	}
}
