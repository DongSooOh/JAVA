package java13;

import java.util.Scanner;

// 데이터 간 구분할 때 구분자 역할 : ' ', '\t', '\n'을 이용해 토큰으로 구분함.
public class Code208A {

	public static void main(String[] args)
	{
		Scanner scin = new Scanner(System.in); // 키보드로 입력(Scanner 객체를 열어줌)
		
		System.out.print("데이터를 입력하세요. : ");
		/* 각 데이터(토큰) 별로 공백을 주어서 구분해줌(각 데이터 별 순서는 중요)
		ex) Alice 010-111-1234 21 160 F */
		String name = scin.next(); // String 데이터를 읽음
		//System.out.print("Phone number : ");
		String phone = scin.next();
		//System.out.print("Age : ");
		int age = scin.nextInt(); // int 데이터를 읽음
		//System.out.print("Height : ");
		float height = scin.nextFloat(); // float 데이터를 읽음
		//System.out.print("Gender : ");
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