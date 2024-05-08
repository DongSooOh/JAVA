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
		
		if (Double.isNaN(val2)) { // Double의 정적 메소드 Double.isNaN(): 매개변수의 값이 숫자인지 확인
			System.out.println("userInput2은 NaN으로 올바른 값을 입력해주세요." );		
		} else {
			currentBalance2 += val2;
			System.out.println(currentBalance2);
		}
		
	}

}
