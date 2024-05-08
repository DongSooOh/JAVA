package java13;

import java.util.Scanner; /* 'import java.util.*;'처럼 와일드카드('*')를 사용해서 모든 클래스를 가져올 수 있음.
일반적으로는 개별적으로 필요한 클래스만 가져오는 것이 가독성, 컴파일 시간 최적화, 코드 충돌 방지 등의 이유로 좋으나 
작은 프로그램 및 테스트용 코드 등에서는 'import java.util.*;'와 같이 와일드카드를 사용하는 것이 편리할 수도 있음.
*/

// 데이터 간 구분할 때 구분자 역할 : ' ', '\t', '\n'로 토큰으로 구분함.
public class Code208 {

	public static void main(String[] args)
	// Java 프로그램의 시작점을 나타내는 메서드 시그니처(signature)로, 
	// 다른 클래스에서 접근 가능하고, 인스턴스화 할 필요 없이 호출할 수 있으며,
	// 반환값이 없고, 문자열 배열을 매개변수로 받아들입니다.
	{
		Scanner scin = new Scanner(System.in); // 키보드로 입력(Scanner 객체를 열어줌)
		System.out.print("Name : ");
		String name = scin.next(); // String 데이터를 읽음
		System.out.print("Phone number : ");
		String phone = scin.next();
		System.out.print("Age : ");
		int age = scin.nextInt(); // int 데이터를 읽음
		System.out.print("Height : ");
		float height = scin.nextFloat(); // float 데이터를 읽음
		System.out.print("Gender : ");
		char gender = scin.next().charAt(0); // char 데이터를 읽음
		// charAt(0) 문자열 인덱스의 0번째 문자를 읽음(보통 남성의 M, 여성의 F로 첫글자로 읽을 수 있음)
		
		System.out.println("Name : " + name);
		System.out.println("Phone : " + phone);
		System.out.println("Age : " + age);
		System.out.println("Height : " + height);
		System.out.println("Gender : " + gender);
		
		scin.close(); // 열어준 Scanner 객체를 닫아줌
	}
}
