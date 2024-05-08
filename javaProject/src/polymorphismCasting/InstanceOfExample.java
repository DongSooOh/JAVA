package polymorphismCasting;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // instanceof 유효성 평가
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) { // 좋은 방법은 아님(유효성 평가 누락)
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); // Parent 클래스의 인스턴스로 강제 타입 변환이 불가능(ClassCastException)
		// 강제 '타입' 변환이라 해당 클래스의 인스턴스이나 타입이 다른 경우만 캐스트 연산으로 강제 변환이 가능하고, 클래스가 다르면 예외 발생 
		method1(parentB);
		method2(parentB); // 예외 발생(InstanceOfExample.java_ 객체 타입 확인)
		// parentB는 Parent 클래스의 인스턴스이므로 Child 타입으로  
	}
}