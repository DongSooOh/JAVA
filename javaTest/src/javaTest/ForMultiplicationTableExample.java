package javaTest;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		
		System.out.println("������");
		
		for (int m = 2; m <= 9; m++) {
			System.out.println();
			System.out.println("***** " + m + "�� *****");
			System.out.println();
			
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}
