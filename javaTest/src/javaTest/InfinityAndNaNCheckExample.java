package javaTest;

import java.util.Scanner;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x 값 입력: ");
		String strX = scan.nextLine();		
		int x = Integer.parseInt(strX);
		
		System.out.println("y 값 입력: ");
		String strY = scan.nextLine();
		double y = Double.parseDouble(strY);
		
		double z =  x / y;
		// double z = x % y;
		
		System.out.println(Double.isInfinite(z)); // z가 무한대인지 true
		System.out.println(Double.isNaN(z)); // z가 숫자가 아닌지 false
		
		/*
			잘못된 코드
			System.out.println(z + 2);
		*/
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("올바른 값을 입력하세요.");
		} else {
			System.out.println(z + 2);
		}
		scan.close();
	} 
}
