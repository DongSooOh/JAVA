package javaProject;

public class Calculator3Example {
	public static void main(String[] args) {
		
		// 라이브러리 클래스에서 static 멤버로 구성되어 있어 new 예약어가 필요하지 않음
		double result1 = 10 * 10 * Calculator3.pi; // 라이브러리 클래스명.정적 필드
		int result2 = Calculator3.plus(10, 5); // 라이브러리 클래스명.정적 메소드
		int result3 = Calculator3.minus(10, 5); 
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}
}
