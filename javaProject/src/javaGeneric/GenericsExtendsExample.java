package javaGeneric;

class DataExtends<T extends Number> { // Number Ŭ������ ���� Ŭ���� Ÿ���� ���� �� ����
	T obj;

	DataExtends(T obj) {
		this.obj = obj;
	}

	int calcMultiple(int n) {
		return obj.intValue() * n;
	}
}

public class GenericsExtendsExample {
	public static void main(String[] args) {

		DataExtends<Integer> d = new DataExtends<Integer>(100); // Integer�� Number�� ���� Ŭ����
		int result1 = d.calcMultiple(5);
		System.out.println(result1);

		DataExtends<Double> e = new DataExtends<Double>(17.5); // Double�� Number�� ���� Ŭ����
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}
