package javaExample;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane(); // sa 객체 생성

		sa.takeOff();	// 객체명.메소드명으로 호출
		sa.fly();
		// 'flyMode'는 인스턴스 멤버로 객체명.인스턴스 멤버명으로 호출하였고
		// 'SUPERSONIC'은 스태틱 멤버로 클래스명.스태틱 멤버명으로 호출
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}