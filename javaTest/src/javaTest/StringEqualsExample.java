package javaTest;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철"; // strVar1과 strVar2는 같은 주소값을 가짐
		String strVar2 = "신민철";
		String strVar3 = new String("신민철"); // 주소값이 다름
		 
		System.out.println(strVar1 == strVar2); // 주소값 비교, T
		System.out.println(strVar1 == strVar3); // F
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // 문자열 비교, T
		System.out.println(strVar1.equals(strVar3)); // T
		
	}

}
