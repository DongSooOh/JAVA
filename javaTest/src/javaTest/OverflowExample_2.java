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
		
		/* 	x�� y�� int���� ���
		 	long z = (long) x * y; �Ǵ� (long) (x * y);�� �ؾ� ��. */
		long z = x * y;
		System.out.println(z);
	}
}
