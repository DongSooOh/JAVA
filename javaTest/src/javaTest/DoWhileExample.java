package javaTest;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) throws Exception {
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 'q'를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do { // 다른 반복문들과는 다르게 최소 1번은 수행하고 이후 조건문에 따라 반복여부 결정
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while(! inputString.equals("q")); // A.equals("B"): A와 B의 '문자열' 비교, A == B: A와 B의 '주소 값' 비교		
		System.out.println();
		System.out.println("프로그램이 종료되었습니다.");
		
		scan.close();
	}
}
