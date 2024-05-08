package javaAPI;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 7번째 인덱스의 문자 리턴
		switch (sex) {
			case '1': // 7번째 인덱스의 값이 1 또는 3이면
			case '3': // char형으로 작은 따옴표(') 표시
				System.out.println("남자입니다.");
				break;
			case '2': // 7번째 인덱스의 값이 2 또는 4면
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
