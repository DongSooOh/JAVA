package practice;

import java.util.Scanner;

public class ScannerForMultiplicationPractice {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("m �� �Է�: ");
		String strM = scan.nextLine();
		int strMI = Integer.parseInt(strM);
		
		System.out.println("n �� �Է�: ");
		String strN = scan.nextLine();
		int strNI = Integer.parseInt(strN);
		
		System.out.println(strMI + " x " + strNI + " = " + (strMI * strNI));
		
		scan.close();
	}

}
