package javaTest;

public class SubStringExample {
	public static void main(String[] args) {

		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		// substring(A, B): 문자열에서 A번 째(포함) 문자부터 B번 째(미포함) 문자 앞까지 잘라낸 문자열을 반환
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		// substring(A): 문자열에서 A번 째(포함) 문자부터 끝까지 잘라낸 문자열을 반환
		System.out.println(secondNum);
		
		
		System.out.println(firstNum.concat(secondNum)); // A.concat(B): A와 B 문자열 결합('+'와 유사)
	}

}
