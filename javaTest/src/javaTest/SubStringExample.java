package javaTest;

public class SubStringExample {
	public static void main(String[] args) {

		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);
		// substring(A, B): ���ڿ����� A�� °(����) ���ں��� B�� °(������) ���� �ձ��� �߶� ���ڿ��� ��ȯ
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		// substring(A): ���ڿ����� A�� °(����) ���ں��� ������ �߶� ���ڿ��� ��ȯ
		System.out.println(secondNum);
		
		
		System.out.println(firstNum.concat(secondNum)); // A.concat(B): A�� B ���ڿ� ����('+'�� ����)
	}

}
