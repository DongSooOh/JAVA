package javaProject;

public class Calculator3Example {
	public static void main(String[] args) {
		
		// ���̺귯�� Ŭ�������� static ����� �����Ǿ� �־� new ���� �ʿ����� ����
		double result1 = 10 * 10 * Calculator3.pi; // ���̺귯�� Ŭ������.���� �ʵ�
		int result2 = Calculator3.plus(10, 5); // ���̺귯�� Ŭ������.���� �޼ҵ�
		int result3 = Calculator3.minus(10, 5); 
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}
}
