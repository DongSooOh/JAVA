package javaGeneric;

class Utill {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		// System.out.println(t1.getClass().getName());

		double v2 = t2.doubleValue();
		// System.out.println(t2.getClass().getName());

		return Double.compare(v1, v2);
	}
}

public class BoundedTypeParameterExample {
	public static void main(String[] args) {

		// String str = Utill.compare("a", "b"); ( X ): ���׸� �޼ҵ尡 Number�� ��ӹ޾Ƽ� String�� �Ұ�
		
		// compare(x, y): x - y��	1. x < y �� -1	2. x = y �� 0	3. x > y �� 1 �� ��ȯ
		int result1 = Utill.compare(10, 20); // static �޼ҵ�� Ŭ������.�޼ҵ��() ȣ�� ����
		System.out.println(result1);

		int result2 = Utill.compare(4.5, 3);
		System.out.println(result2);
	}
}
