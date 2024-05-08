package javaTest;
public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10"); // value1 ~ 3: 스택 영역
		double value2 = Double.parseDouble("3.14"); // Integer, Double, Boolean은 힙 영역
		boolean value3 = Boolean.parseBoolean("true");
		// 기본 자료형 value = 기본 자료형(클래스명).parse기본 자료형("문자열");
		// 문자열을 기본 타입으로 강제 타입변환
		// int value = Integer.parseInt("str"); 여기서의 value는 스택 영역에 저장
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
		String str1 = String.valueOf(10); // str1 ~ 3: 힙 영역
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		// String value = String.valueOf(기본 타입의 값); 여기서 value는 힙 영역에 저장
		// 기본 타입의 값을 문자열로 변경
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
	}

}
