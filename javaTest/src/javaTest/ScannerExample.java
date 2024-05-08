package javaTest;

import java.util.Scanner; // 1. Scanner는 자동 지원되지가 않아 사용하려면 import 구문을 사용해야 함.

public class ScannerExample {
	/* 2. 추가로 메인 메소드에 'throws Exception'으로 예외처리도 해주어야 함.(해당 메소드가 발생할 수 있는 모든 예외를 호출자에게 던진다는 것을 나타냄)
	 예외를 던질 때 이것은 해당 메소드 내에서 예외가 발생할 수 있다는 것을 호출자에게 알리는 것
	 호출자가 예외를 처리하지 않으면, 예외는 상위 호출자로 전파될 것이며, 최종적으로는 
	 JVM(Java Virtual Machine)에 의해 처리될 것입니다. 따라서, 이 방법은 예외를 처리하는 유연성을 
	 호출자에게 주고, 예외 처리에 대한 세부 사항을 호출자에게 숨기는 데 유용합니다. */
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); //System.in: 입력, System.out: 출력
		
		System.out.println("x 값 입력: ");
		String strX = scanner.nextLine(); // scanner.nextLine(): 문자열 객체를 생성
		int x = Integer.parseInt(strX); // 기본 타입 value = 기본 타입(클래스형).parse기본타입("문자열");
		
		System.out.println("y 값 입력: ");
		String strY = scanner.nextLine(); // 사용자가 엔터키를 누를 때까지 입력한 문자열을 읽고 반환
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
		
		while(true) {
			System.out.println("입력 문자열: ");
			String data = scanner.nextLine(); // 사용자가 입력한 문자열 객체를 data에 반환(대입)
			if (data.equals("q")) { // 해당 객체 data가 q와 동일한지 확인
				break; // 동일하면 가장 가까운 반복문(while)을 탈출
			}
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		System.out.println("종료");
		scanner.close(); // resource leak 경고 해결
	}
}
