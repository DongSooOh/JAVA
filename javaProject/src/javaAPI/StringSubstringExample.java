package javaAPI;

public class StringSubstringExample {
	public static void main(String[] args) {

		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6); // 0��° �ε������� 6��° �ε���(���������� 5��°) ���� ���ڿ� ����
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7��° ���ڿ����� ����
		System.out.println(secondNum);

		// String thirdNum = ssn.substring(0, 6, 2); // �ڹٿ��� �Ű����� ���� 1~2���� ����
		// System.out.println(thirdNum);
	}
}