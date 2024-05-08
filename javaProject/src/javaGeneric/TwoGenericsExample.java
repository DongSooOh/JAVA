package javaGeneric;

class TwoGenerics<T, V> {
	T data1;
	V data2;

	TwoGenerics(T d1, V d2) {
		this.data1 = d1;
		this.data2 = d2;
	}

	void showGenericType() {
		// ��ü��.getClass().getName(); : �ش� ��ü�� Ŭ���� �̸��� ����ϴ� �޼ҵ�
		// (��ü�� � Ŭ�����κ��� ������ �Ǿ����� Ȯ��)
		System.out.println("Type of T: " + data1.getClass().getName());
		System.out.println("Type of V: " + data2.getClass().getName());
	}

	T getData1() {
		return data1;
	}

	V getData2() {
		return data2;
	}
}

public class TwoGenericsExample {
	public static void main(String[] args) {

		TwoGenerics<Integer, String> x = new TwoGenerics<Integer, String>(100, "hello");

		x.showGenericType();

		int y = x.getData1();
		System.out.println("y value: " + y);

		String z = x.getData2();
		System.out.println("z value: " + z);
	}
}
