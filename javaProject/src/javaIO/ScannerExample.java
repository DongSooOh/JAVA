package javaIO;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열 입력> ");
		String inputString = scanner.nextLine(); // nextLine(): String 값 읽음
		System.out.println(inputString);
		System.out.println();

		System.out.print("정수 입력> ");
		int inputInt = scanner.nextInt(); // nextInt(): int 값 읽음
		System.out.println(inputInt);
		System.out.println();

		System.out.print("실수 입력> ");
		double inputDouble = scanner.nextDouble(); // nextDouble(): double 값 읽음
		System.out.println(inputDouble);

		scanner.close();
	}
}
