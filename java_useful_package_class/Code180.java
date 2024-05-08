package java11;

public class Code180 {

	public static void main(String[] args) 
	{
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		// new 키워드는 매번 새로운 인스턴스를 생성, s1 != s2
		if (s1 == s2) System.out.println("s1 == s2");
		else System.out.println("s1 != s2");
		// 같은 참조값을 갖고 있는지 비교
		
		String s3 = "Java Programming";
		String s4 = "Java Programming";
		// 쌍따옴표("")는 같은 문자열은 공유, s3 == s4
		if (s3 == s4) System.out.println("s3 == s4");
		else System.out.println("s3 != s4");
		
		String s5 = new String("Good morning");
		String s6 = "Good morning";
		// new 키워드와 쌍따옴표("")는 같은 문자열이라도 공유하지 않음
		if (s5 == s6) System.out.println("s5 == s6");
		else System.out.println("s5 != s6");
	}
}
