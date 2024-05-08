package javaTest;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 1000000000000; 컴파일 에러(int형 범위 초과)
		long var4 = 1000000000000L; // Long형 적용
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}