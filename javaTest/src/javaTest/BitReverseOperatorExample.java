package javaTest;

public class BitReverseOperatorExample {
	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = ~v1; // ��Ʈ ���� ������(~): 0�� 1��, 1�� 0���� ��ȯ
		int v3 = ~v1 + 1; // ����
		
		System.out.println(toBinaryString(v1) + "(������: " + v1 +")");
		System.out.println(toBinaryString(v2) + "(������: " + v2 +")");
		System.out.println(toBinaryString(v3) + "(������: " + v3 +")");
		System.out.println(); // �ٹٲ�
		
		int v4 = -10;
		int v5 = ~v4; // ��Ʈ ���� ������(~)
		int v6 = ~v4 + 1; // ����
		
		System.out.println(toBinaryString(v4) + "(������: " + v4 +")");
		System.out.println(toBinaryString(v5) + "(������: " + v5 +")");
		System.out.println(toBinaryString(v6) + "(������: " + v6 +")");
	}
	
	public static String toBinaryString(int value) {
		
		String str = Integer.toBinaryString(value);
		
		while(str.length() < 32) { // ���⼭�� '32'�� int value���� int Ÿ���� 4byte�� �̸� bit�� ȯ���ϸ� 32bit�� ��
			str = "0" + str; // str�� ���ڿ��� ��ȯ
		}
		return str;
	}
	
}
