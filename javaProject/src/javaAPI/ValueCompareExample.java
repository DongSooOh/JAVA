package javaAPI;

public class ValueCompareExample {
	public static void main(String[] args) {

		System.out.println("[-128 ~ 127 �ʰ����� ���]");
		Integer obj1 = 300; // 1����Ʈ�� ȯ���ϴµ�, 300�� -128 ~ 127 ������ �ʰ������� ��Ȯ�� �񱳰� ����
		Integer obj2 = 300;
		System.out.println("==���: " + (obj1 == obj2)); // ��Ȯ�� �񱳰� ���� false ��ȯ
		System.out.println("��ڽ� �� == ���: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() ���: " + obj1.equals(obj2));

		System.out.println("\n[-128 ~ 127 �������� ���]");
		Integer obj3 = 10; // 10�� -128~127 ���� �� ������ ��Ȯ�� �񱳰� ����
		Integer obj4 = 10;
		System.out.println("==���: " + (obj3 == obj4));
		System.out.println("��ڽ� �� ==���: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() ���: " + obj3.equals(obj4));
	}
}
