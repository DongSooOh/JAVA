package javaProject;

public class Car2Example {
	public static void main(String[] args) {

		Car2 myCar = new Car2("검정", 3000);

		System.out.println(myCar); // 참조변수 myCar의 참조(주소)가 출력됨

		// '검정, 3000'이 출력되게 하려면 toString() 메소드를 이용해야 함
	}
}
