package java16;

interface MyValue1{ // 인터페이스 생성
	int getValue();
}

public class Code262 {
	public static void main(String[] args) {
		MyValue1 mv1; // 인터페이스 참조 변수 생성 
		mv1 = () -> 100; // 인터페이스 참조 변수에 람다 표현식 할당
		System.out.println(mv1.getValue()); // 람다 표현식 수행(지연처리)
	}
} 
