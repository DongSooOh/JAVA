package javaTest;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) throws Exception {
		
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� 'q'�� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do { // �ٸ� �ݺ�������� �ٸ��� �ּ� 1���� �����ϰ� ���� ���ǹ��� ���� �ݺ����� ����
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
		} while(! inputString.equals("q")); // A.equals("B"): A�� B�� '���ڿ�' ��, A == B: A�� B�� '�ּ� ��' ��		
		System.out.println();
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		scan.close();
	}
}
