package javaTest;

public class StringEqualsExample2 {
	public static void main(String[] args) {

		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö"; // strVar1�� strVar2�� ������ ����(�ּҰ�)�� ����

		if (strVar1 == strVar2) { // A == B: A�� B�� �ּҰ� ��
			System.out.println("strVar1�� strVar2�� ����(�ּ�)�� ����");
		} else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}

		if (strVar1.equals(strVar2)) { // A.equals(B): A�� B�� ���ڿ� ��
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}

		String strVar3 = new String("�Ź�ö"); // strVar3�� strVar4�� ������ ����(�ּҰ�)�� ������ ����.
		String strVar4 = new String("�Ź�ö"); // ���� ��ü�� ����(�ٸ� �ּҰ�)

		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ����(�ּ�)�� ����");
		} else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}

	}

}
