package javaTest;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
		
		
		
		
		
		String userInput2 = "10";
		double val2 = Double.valueOf(userInput2);
		
		double currentBalance2 = 10000.0;
		
		if (Double.isNaN(val2)) { // Double�� ���� �޼ҵ� Double.isNaN(): �Ű������� ���� �������� Ȯ��
			System.out.println("userInput2�� NaN���� �ùٸ� ���� �Է����ּ���." );		
		} else {
			currentBalance2 += val2;
			System.out.println(currentBalance2);
		}
		
	}

}
