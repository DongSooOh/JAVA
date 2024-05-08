package javaTest;

import java.util.Scanner;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x �� �Է�: ");
		String strX = scan.nextLine();		
		int x = Integer.parseInt(strX);
		
		System.out.println("y �� �Է�: ");
		String strY = scan.nextLine();
		double y = Double.parseDouble(strY);
		
		double z =  x / y;
		// double z = x % y;
		
		System.out.println(Double.isInfinite(z)); // z�� ���Ѵ����� true
		System.out.println(Double.isNaN(z)); // z�� ���ڰ� �ƴ��� false
		
		/*
			�߸��� �ڵ�
			System.out.println(z + 2);
		*/
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�ùٸ� ���� �Է��ϼ���.");
		} else {
			System.out.println(z + 2);
		}
		scan.close();
	} 
}
