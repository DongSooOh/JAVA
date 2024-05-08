package javaTest;

public class SwitchCharExample {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a': // 대소문자를 구분하지 않도록 대소문자 둘 다 작성
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}

	}

}
