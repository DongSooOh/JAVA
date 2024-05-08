package javaTest;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) { // 비트 논리곱
			System.out.println("대문자이군요.");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자이군요.");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) { // 비트 논리합
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}

	}

}
/* 	
	A = 4, B = 5라고 가정했을 때,
	비트 논리곱의 경우 4는 '0100', 5는 '0101'이 되어 결과값이 '0100'(== 4)이 나옴.
	(같은 자리수를 비교했을 때 둘 다 1인 경우만 1을 반환)
	비트 논리합의 경우 결과값으로 '0101'(== 5)이 나옴.
	(같은 자리수를 비교했을 때 둘 중에 하나만 1이면 1을 반환)
*/
