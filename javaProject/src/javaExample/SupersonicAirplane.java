package javaExample;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // static 멤버로 '클래스명.멤버명'으로 호출이 가능(SupersonicAirplan.NORMAL)
	public static final int SUPERSONIC = 2; // 동일하게 'SupersonicAirplane.SUPERSONIC'으로 호출

	public int flyMode = NORMAL; // 'static'이 없는 인스턴스 멤버로 '객체명.멤버명'으로 호출

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모 클래스(Airplane)의 fly() 메소드 호출
		}
	}
}
