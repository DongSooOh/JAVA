package javaTest;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		
		/*
			int sum = 0;
			
			for (int i = 1; i <= 100; i++) {
				sum += 1;
			}
			
			System.out.println("1~100의 합: " + sum);
		*/
		
		int sum = 0;
		
		int i = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + (i-1) + "의 합: " + sum);
	}
}
