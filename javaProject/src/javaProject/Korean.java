package javaProject;

public class Korean {

	// �ʵ�
	String nation = "���ѹα�";
	String name;
	String ssn;

	// ������
	/*
		public Korean(String n, String s){ name = n; ssn = s; } �� ó�� �Ű����� ���� s, n����
		�ϸ� �ĺ��� ���ѵǾ� ���� ���������� �������� ����.
	 */

	public Korean(String name, String ssn) { // �߰��� �̷��� �Ű������� 2�� ���� �����ڰ� ���� ���
		// �ڵ� �����ڴ� ȣ����� ����. �ʿ�� �ڵ� �����ڸ� ������ ��.(Korean(){})
		this.name = name;
		this.ssn = ssn;
	}
}
