package exceptionExample;

public class TryCatchFinallyExample {
	public static void main(String[] args) {

		try { // Class.forName() 메소드의 매개값으로 주어진 클래스가 존재하지 않으면 ClassNotFoundException 예외가 발생
			Class clazz = Class.forName("java.lang.String2"); // java.lang.String2는 존재하지 않음
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}