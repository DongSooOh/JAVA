package javaGeneric;

// <> 안의 매개변수는 T, V, S로 작성
class Data<T> { 	// 클래스명 옆에 제네릭 기호(<>)를 적고 그 안에 매개변수 작성
	T obj; 			// 인스턴스 변수 obj의 자료형은 T
	

	Data(T obj) {	// 생성자 Data는 자료형이 T인 인수 한 개를 입력받음
		this.obj = obj;
	}

	T getObj() {	// 인스턴스 변수 obj의 자료형은 T
		return obj;
	}

	void showType() {
		// 해당 객체의 클래스 이름을 출력하는 메소드(객체가 어떤 클래스로부터 생성됐는지 확인)
		// 객체명.getClass().getName();
		System.out.println("Type of T: " + obj.getClass().getName());
	}
}

public class GenericStandardExample {
	public static void main(String[] args) {

		Data<Integer> d1 = new Data<Integer>(100); // 정수 100 인수
		System.out.println(d1.getObj());
		d1.showType();

		Data<Double> d2 = new Data<Double>(3.14); // 실수 3.14 인수
		System.out.println(d2.getObj());
		d2.showType();

		Data<String> d3 = new Data<String>("JAVA"); // 문자열 "JAVA" 인수
		System.out.println(d3.getObj());
		d3.showType();

	}

}
