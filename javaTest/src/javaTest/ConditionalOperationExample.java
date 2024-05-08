package javaTest;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// (score > 90): ���ǽ�, 'A': �ǿ�����2(true), ((score > 80) ? 'B' : 'C'): �ǿ�����3(false) 
		// (score > 80): ���ǽ�, 'B': �ǿ�����2(true), 'C': �ǿ�����3(false))
		/*
			���� ������(���� �����)
			: ���ǽ�(�ǿ�����1) ? �� �Ǵ� �����(�ǿ�����2) : �� �Ǵ� �����(�ǿ�����3)
			
			���ǽ��� 'true'�� ��ȯ�ϸ� �ǿ�����2�� ���, 'false'�� �ǿ�����3�� ���
			���ǽ� ��(true) �ǿ�����2/ ��(false) �ǿ�����3
		*/
		
		System.out.println(score + "���� " + grade + "����Դϴ�.");
	}
}
