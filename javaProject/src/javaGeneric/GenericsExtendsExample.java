package javaGeneric;

class DataExtends<T extends Number> { // Number 클래스의 하위 클래스 타입은 들어올 수 있음
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

		DataExtends<Integer> d = new DataExtends<Integer>(100); // Integer는 Number의 하위 클래스
		int result1 = d.calcMultiple(5);
		System.out.println(result1);

		DataExtends<Double> e = new DataExtends<Double>(17.5); // Double도 Number의 하위 클래스
		int result2 = e.calcMultiple(5);
		System.out.println(result2);
	}
}
