package javaTest;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = ~v1; // 비트 반전 연산자(~): 0을 1로, 1을 0으로 변환
		int v3 = ~v1 + 1; // 보수
		
		System.out.println(toBinaryString(v1) + "(십진수: " + v1 +")");
		System.out.println(toBinaryString(v2) + "(십진수: " + v2 +")");
		System.out.println(toBinaryString(v3) + "(십진수: " + v3 +")");
		System.out.println(); // 줄바꿈
		
		int v4 = -10;
		int v5 = ~v4; // 비트 반전 연산자(~)
		int v6 = ~v4 + 1; // 보수
		
		System.out.println(toBinaryString(v4) + "(십진수: " + v4 +")");
		System.out.println(toBinaryString(v5) + "(십진수: " + v5 +")");
		System.out.println(toBinaryString(v6) + "(십진수: " + v6 +")");
	}
	
	public static String toBinaryString(int value) {
		
		String str = Integer.toBinaryString(value);
		
		while(str.length() < 32) { // 여기서의 '32'는 int value에서 int 타입이 4byte로 이를 bit로 환산하면 32bit가 됨
			str = "0" + str; // str을 문자열로 반환
		}
		return str;
	}
	
}
