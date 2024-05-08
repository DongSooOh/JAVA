package java16;

interface MyValue3{
	double getValue(int n);
}

public class Code264 {
	public static void main(String[] args) {
		MyValue3 mv3; // MyValue3 참조 변수 선언
		mv3 = (n) -> 1.0/n;
		System.out.println(mv3.getValue(5));
		System.out.println(mv3.getValue(10));
		System.out.println(mv3.getValue(100));
		System.out.println(mv3.getValue(2000));
	}
}
