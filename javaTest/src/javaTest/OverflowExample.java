package javaTest;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // 결과값 overflow로 이상한 값이 출력
	}
}
