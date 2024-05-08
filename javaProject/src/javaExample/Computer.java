package javaExample;

public class Computer extends Calculator {
	@Override // @Override 어노테이션: 메소드가 정확히 재정의된 것인지 컴파일러가 확인하여 개발자의 실수를 줄여줌
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r; // PI는 스태틱 멤버(클래스명.스태틱 멤버명)
		// 외부에서 객체 생성 없이도 호출이 가능
	}
}