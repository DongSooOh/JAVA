package abstractClass;

public class PhoneExample {
	public static void main(String[] args) {

		// Phone phone new Phone(); Phone 클래스가 추상클래스이므로 객체 생성이 불가능

		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
