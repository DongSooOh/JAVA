package java16;

interface MyValue4{
	boolean getValue(int n);
}

public class Code265 {
	public static void main(String[] args) {
		MyValue4 mv4; // MyValue4 참조 변수 선언
		mv4 = (n) -> (n % 2) == 0; // 지연 처리
		System.out.println(mv4.getValue(50));
		System.out.println(mv4.getValue(25));
	}
}
