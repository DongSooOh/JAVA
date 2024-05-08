package javaTest;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수 값 저장
		double var1 = 3.14;
		
		// float var2 = 3.14; // 컴파일 에러
		
		float var3 = 3.14F; // 혹은 3.14f;
		
		// 정밀도 테스트(값 소수점 아래 자리수 확인)
		double var4 = 0.1234567890123456789; // 소수점 아래 15자리
		float var5 = 0.1234567890123456789F; // 소수점 아래 7자리이나 6자리까지가 정확하여 7자리 이상은 double형
		// float : 소수점 아래 7자리(8자리 반올림), double: 소수점 아래 15자리(16자리 반올림)까지 출력
		
		System.out.println("var1 : " + var1);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		// e 사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
		System.out.println("var9 : " + var9);

	}

}
// Ctrl + F11 콘솔창 출력