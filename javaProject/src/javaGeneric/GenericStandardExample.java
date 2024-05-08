package javaGeneric;

// <> ���� �Ű������� T, V, S�� �ۼ�
class Data<T> { 	// Ŭ������ ���� ���׸� ��ȣ(<>)�� ���� �� �ȿ� �Ű����� �ۼ�
	T obj; 			// �ν��Ͻ� ���� obj�� �ڷ����� T
	

	Data(T obj) {	// ������ Data�� �ڷ����� T�� �μ� �� ���� �Է¹���
		this.obj = obj;
	}

	T getObj() {	// �ν��Ͻ� ���� obj�� �ڷ����� T
		return obj;
	}

	void showType() {
		// �ش� ��ü�� Ŭ���� �̸��� ����ϴ� �޼ҵ�(��ü�� � Ŭ�����κ��� �����ƴ��� Ȯ��)
		// ��ü��.getClass().getName();
		System.out.println("Type of T: " + obj.getClass().getName());
	}
}

public class GenericStandardExample {
	public static void main(String[] args) {

		Data<Integer> d1 = new Data<Integer>(100); // ���� 100 �μ�
		System.out.println(d1.getObj());
		d1.showType();

		Data<Double> d2 = new Data<Double>(3.14); // �Ǽ� 3.14 �μ�
		System.out.println(d2.getObj());
		d2.showType();

		Data<String> d3 = new Data<String>("JAVA"); // ���ڿ� "JAVA" �μ�
		System.out.println(d3.getObj());
		d3.showType();

	}

}
