package exceptionExample;

public class ThrowsExample {
	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) { // �̰�
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}

	public static void findClass() throws ClassNotFoundException { // ȣ���� ������ ����ó��
		Class clazz = Class.forName("java.lang.String2");
	}
}