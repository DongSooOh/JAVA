package javaProject;

public class FieldInitValueExample {
	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();

		// ��ü ���ο����� '�ʵ��'���� ������ ����
		System.out.println("byteField: " + fiv.byteField); // �ܺο��� ������ ���� '������.�ʵ��'
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);

		System.out.println("booleanField: " + fiv.booleanField);

		System.out.println("charFiedl: " + fiv.charField);

		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);

		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
