package javaTest;

import java.util.Scanner;

public class StudentScoreExample {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�л��� �̸�: ");
		String strN = scan.nextLine();
		
		System.out.println("����1 ����: ");
		String strS1 = scan.nextLine();
		int score1 = Integer.parseInt(strS1);
		
		System.out.println("����2 ����: ");
		String strS2 = scan.nextLine();
		int score2 = Integer.parseInt(strS2);
		
		System.out.println("����3 ����: ");
		String strS3 = scan.nextLine();
		int score3 = Integer.parseInt(strS3);
		
		int score4 = score1 + score2 + score3; // ����
		
		int score5 = score4 / 3; // ���
		
		System.out.println("�л��� �̸�: " + strN);
		System.out.println("����1�� ����: " + score1);
		System.out.println("����2�� ����: " + score2);
		System.out.println("����3�� ����: " + score3);
		
		
		System.out.println("������ ����: " + score4);
		System.out.println("�������: " + score5);
		
		scan.close();
	}
}
