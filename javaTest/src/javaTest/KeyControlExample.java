package javaTest;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("------------------------------");
			System.out.println("����: ");
			
			String strNum = scan.nextLine();
			
			if(strNum.equals("1")) { // A.equals("B"): A�� B�� '���ڿ�' ��
									  // A == B: A�� B�� '�ּ� ��' ��
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if(strNum.equals("2")) {
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if(strNum.equals("3")) {
				run = false;
			}
		}
		System.out.println("����");
		scan.close();
	}
}
