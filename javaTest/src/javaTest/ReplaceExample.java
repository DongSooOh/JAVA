package javaTest;

public class ReplaceExample {
	public static void main(String[] args) {
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); 
		// replace(A, B): 문자열에서 A문자를 B문자로 변환 후 변경된 문자열을 반환
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
