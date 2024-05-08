package javaTest;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 시작인 '프'가 인덱스 3으로 3이 반환
		System.out.println(location);
		String substring = subject.substring(location); // location에는 '프로그래밍'이 들어가 있음
		System.out.println(substring);
		
		location = subject.indexOf("자바"); // 1
		
		if (location != -1){ // 자바 포함 여부 확인
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바"); // contains(): 해당 문자열을 포함하고 있는지 확인
		
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
	}
}
