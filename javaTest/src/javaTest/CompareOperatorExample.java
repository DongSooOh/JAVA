package javaTest;

public class CompareOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // 65 < 66;
		System.out.println("result4: " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4); // 정수와 실수는 '값'만 비교
		System.out.println("result5: " + result5);
		
		float num5 = 0.1F;
		double num6 = 0.1;
		boolean result6 = (num5 == num6); // 실수끼리의 비교는 '값'과 '정밀도'로 비교
		boolean result7 = (num5 == (float)num6); // double을 float으로 맞춰줌
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2));
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}

}
