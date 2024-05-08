package javaAPI;

public class StringToLowerUpperIgnoreCaseExample {
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";

		System.out.println(str1.equals(str2)); // 대소문자 비교로 인해 'false' 값 반환

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2)); // 둘 다 같은 소문자로 'true' 값 반환

		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 비교 없이 같은 문자로 취급하여 'true' 값 반환
		// A(65)와 a(97)을 같은 문자로 취급함

	}

}
