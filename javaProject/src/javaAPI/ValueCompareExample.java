package javaAPI;

public class ValueCompareExample {
	public static void main(String[] args) {

		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300; // 1바이트만 환산하는데, 300은 -128 ~ 127 범위의 초과값으로 정확한 비교가 힘듦
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2)); // 정확한 비교가 힘들어서 false 반환
		System.out.println("언박싱 후 == 결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));

		System.out.println("\n[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10; // 10은 -128~127 범위 내 값으로 정확한 비교가 가능
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}
}
