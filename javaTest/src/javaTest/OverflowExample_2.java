package javaTest;

public class OverflowExample_2 {
	public static void main(String[] args) {
		/*
			int x = 1000000;
			int y = 1000000;
			int z = x * y;
			System.out.println(z); 
		*/
		
		int x = 1000000;
		long y = 1000000L;
		
		/* 	x와 y가 int형일 경우
		 	long z = (long) x * y; 또는 (long) (x * y);로 해야 됨. */
		long z = x * y;
		System.out.println(z);
	}
}
