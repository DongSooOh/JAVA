package packageTest1;

public class A {
	
	// 필드
	A a1 = new A(true); 	// boolean
	A a2 = new A(1); 		// int
	A a3 = new A("문자열"); 	// String
	
	// 생성자
	public A(boolean b) {} 	// 아무나 사용이 가능
	A(int b){}				// default로 다른 패키지만 제한
	private A(String s) {}	// private은 같은 클래스 내에서만 가능
}	
