package packageTest1;

public class A {
	
	// �ʵ�
	A a1 = new A(true); 	// boolean
	A a2 = new A(1); 		// int
	A a3 = new A("���ڿ�"); 	// String
	
	// ������
	public A(boolean b) {} 	// �ƹ��� ����� ����
	A(int b){}				// default�� �ٸ� ��Ű���� ����
	private A(String s) {}	// private�� ���� Ŭ���� �������� ����
}	
