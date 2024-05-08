package java16;

interface MyValue2{
	double getValue(); // no parameter(매개변수)
}

public class Code263 {
	public static void main(String[] args) {
		MyValue2 mv2; // MyValue2 변수 선언
		mv2 = () -> 100.5; // mv2에 람다 표현식 할당(수행X)
		System.out.println(mv2.getValue()); // 람다 표현식 호출(수행)
	}
}
