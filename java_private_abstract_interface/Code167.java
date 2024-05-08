package java910;

import java.util.*;

interface Limit{ // public은 클래스 뿐만 아니라 인터페이스도 포함되어 하나만 사용
	int MAX = 100; // 파일명이 Code167이라 클래스 앞에 public사용
	int MIN = 0;
}

public class Code167 {

	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter number between 0 and 100 : ");
		int num = scin.nextInt();
		scin.close();
		
		if (num < Limit.MIN || num > Limit.MAX)
			System.out.println("Out of range");
		// Scanner를 활용, System.in 입력한 값이 0보다 작거나 
		// 100보다 크면 'Out of range' 문구가 출력됨.

	}

}
// 순서는 위에서부터 '패키지 선언 - import'문 - public 클래스(파일명) or 인터페이스
// 코드의 가독성을 높이기 위한 규칙