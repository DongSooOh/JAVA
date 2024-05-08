package javaAPI;

public class SmartPhoneExample {
	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

		String strObj = myPhone.toString();

		System.out.println(strObj);
		System.out.println(myPhone); // 객체 호출 시 toString() 호출되어 객체의 문자열 표현을 반환
		// System.out.println(myPhone.toString());과 동일

	}
}
