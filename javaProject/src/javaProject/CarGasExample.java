package javaProject;

public class CarGasExample {
	public static void main(String[] args) {

		CarGas myCarGas = new CarGas(); // CarGas 클래스(라이브러리 클래스)의 기본 생성자 호출

		myCarGas.setGas(5); // 매개변수를 주면서 CarGas 클래스의 setGas() 메소드를 호출

		boolean gasState = myCarGas.isLeftGas(); // CarGas 클래스의 isLeftGas() 메소드를 호출
		if (gasState) {
			System.out.println("출발합니다.");
			myCarGas.run(); // CarGas 클래스의 run() 메소드 호출
		}

		if (myCarGas.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
