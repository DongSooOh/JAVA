package javaTest;

public class BitShiftExample1 {
	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3; // num1의 값(1)을 왼쪽으로 3칸 이동
		// 1은 '01'으로 3칸 이동하면 '01000'이 되어 8이 출력됨
		// 1024(2^10) 512(2^9) 256(2^8) 128(2^7) 64(2^6) 32(2^5) 16(2^4) 8(2^3) 4(2^2) 2(2^1) 1(2^0)
		int result2 = num1 * (int) Math.pow(2, 3); // Math.pow(a, b): a의 b제곱
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);

	}

}
