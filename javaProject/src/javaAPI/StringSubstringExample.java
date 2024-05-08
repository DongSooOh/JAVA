package javaAPI;

public class StringSubstringExample {
	public static void main(String[] args) {

		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6); // 0번째 인덱스부터 6번째 인덱스(미포함으로 5번째) 사이 문자열 추출
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7번째 문자열부터 추출
		System.out.println(secondNum);

		// String thirdNum = ssn.substring(0, 6, 2); // 자바에서 매개변수 값은 1~2개만 가능
		// System.out.println(thirdNum);
	}
}