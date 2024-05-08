package javaTest;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------------------");
			System.out.println("선택: ");
			
			String strNum = scan.nextLine();
			
			if(strNum.equals("1")) { // A.equals("B"): A와 B의 '문자열' 비교
									  // A == B: A와 B의 '주소 값' 비교
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("종료");
		scan.close();
	}
}
