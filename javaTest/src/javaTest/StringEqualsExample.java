package javaTest;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "�Ź�ö"; // strVar1�� strVar2�� ���� �ּҰ��� ����
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö"); // �ּҰ��� �ٸ�
		 
		System.out.println(strVar1 == strVar2); // �ּҰ� ��, T
		System.out.println(strVar1 == strVar3); // F
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // ���ڿ� ��, T
		System.out.println(strVar1.equals(strVar3)); // T
		
	}

}
