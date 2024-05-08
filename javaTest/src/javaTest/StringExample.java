package javaTest;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; // "출력하려면 \"로 표기
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");
	}

}
/*
 	이스케이프 문자(\)
 	\t : 탭
 	\n : 줄 바꿈(라인 피드)
 	\r : 캐리지리턴
 	\" : " 출력
 	\' : ' 출력
 	\\ : \ 출력
 	\u16진수 : 16진수 유니코드에 해당하는 문자 출력
*/
