package javaIO;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڿ� �Է�> ");
		String inputString = scanner.nextLine(); // nextLine(): String �� ����
		System.out.println(inputString);
		System.out.println();

		System.out.print("���� �Է�> ");
		int inputInt = scanner.nextInt(); // nextInt(): int �� ����
		System.out.println(inputInt);
		System.out.println();

		System.out.print("�Ǽ� �Է�> ");
		double inputDouble = scanner.nextDouble(); // nextDouble(): double �� ����
		System.out.println(inputDouble);

		scanner.close();
	}
}
