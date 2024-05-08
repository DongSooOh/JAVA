package javaTest;

import java.util.Scanner;

public class StudentScoreExample {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생의 이름: ");
		String strN = scan.nextLine();
		
		System.out.println("과목1 점수: ");
		String strS1 = scan.nextLine();
		int score1 = Integer.parseInt(strS1);
		
		System.out.println("과목2 점수: ");
		String strS2 = scan.nextLine();
		int score2 = Integer.parseInt(strS2);
		
		System.out.println("과목3 점수: ");
		String strS3 = scan.nextLine();
		int score3 = Integer.parseInt(strS3);
		
		int score4 = score1 + score2 + score3; // 총합
		
		int score5 = score4 / 3; // 평균
		
		System.out.println("학생의 이름: " + strN);
		System.out.println("과목1의 점수: " + score1);
		System.out.println("과목2의 점수: " + score2);
		System.out.println("과목3의 점수: " + score3);
		
		
		System.out.println("점수의 총합: " + score4);
		System.out.println("평균점수: " + score5);
		
		scan.close();
	}
}
