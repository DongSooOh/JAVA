package javaGeneric;

class TwoGenerics<T, V> {
	T data1;
	V data2;

	TwoGenerics(T d1, V d2) {
		this.data1 = d1;
		this.data2 = d2;
	}

	void showGenericType() {
		// 객체명.getClass().getName(); : 해당 객체의 클래스 이름을 출력하는 메소드
		// (객체가 어떤 클래스로부터 생성이 되었는지 확인)
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
