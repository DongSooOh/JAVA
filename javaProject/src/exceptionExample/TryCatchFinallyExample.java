package exceptionExample;

public class TryCatchFinallyExample {
	public static void main(String[] args) {

		try { // Class.forName() �޼ҵ��� �Ű������� �־��� Ŭ������ �������� ������ ClassNotFoundException ���ܰ� �߻�
			Class clazz = Class.forName("java.lang.String2"); // java.lang.String2�� �������� ����
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}