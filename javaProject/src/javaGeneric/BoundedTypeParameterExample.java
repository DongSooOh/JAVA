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

		// String str = Utill.compare("a", "b"); ( X ): 제네릭 메소드가 Number를 상속받아서 String은 불가
		
		// compare(x, y): x - y로	1. x < y → -1	2. x = y → 0	3. x > y → 1 값 반환
		int result1 = Utill.compare(10, 20); // static 메소드로 클래스명.메소드명() 호출 가능
		System.out.println(result1);

		int result2 = Utill.compare(4.5, 3);
		System.out.println(result2);
	}
}
