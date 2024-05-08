package javaTest;

public class CharAtExample {
	public static void main(String[] args) {

		String ssn = "9506241230123";
		char sex = ssn.charAt(6); // -.charAt(): 해당 인덱스의 문자를 리턴하여 특정 위치의 문자를 얻음
		// 6번 째 인덱스의 값 1을 반환.

		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
