package exceptionExample;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) { // 배열의 인덱스를 벗어나는 위치에 접근하려고 할 때 발생하는 예외(배열의 범위 초과)
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(NumberFormatException e) { // 문자열을 숫자로 변환하려고 할 때 발생하는 예외(Integer.parseInt()와 같은 메소드를 사용할 때 같이 사용)
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
