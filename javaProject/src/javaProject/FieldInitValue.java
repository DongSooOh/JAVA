package javaProject;

public class FieldInitValue {

	// �ʵ�
	byte byteField; // byte, short, int �ʱⰪ: 0
	short shortField;
	int intField;
	long longField; // �ʱⰪ: 0L

	boolean booleanField; // �ʱⰪ: false

	char charField; // �ʱⰪ: \u0000(�� ����)

	float floatField; // �ʱⰪ: 0.0F
	double doubleField; // �ʱⰪ: 0.0

	int[] arrField; // int[]�� ��ü(�迭), �ʱⰪ: null
	String referenceField; // String�� ��ü(���ڿ�), �ʱⰪ: null
}
/*
	byte, short, int, long, float, double, char, boolean�� ���� ������ Ÿ������ �⺻���� ������ ����
	�⺻ Ÿ���� �ʱⰪ�� byte, short, int�� '0', long�� '0L', char�� '\u0000(�� ������ ���)',
	float�� '0.0F', double�� '0.0', boolean�� 'false'.

	int[](�迭), String(Ŭ����), �������̽��� ���� Ÿ������ ��ü�� �ǹ�. �ʱⰪ�� 'null'
 */