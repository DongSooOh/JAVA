package interfaceExample;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl rc; // 인터페이스명 변수명;으로 선언(인터페이스가 public 접근 제한자라 가능)

		rc = new Television(); // Television 객체를 참조, rc를 사용하여 텔레비전을 제어 가능

		rc = new Audio(); // 동일하게 Audio 객체를 참조, rc를 사용하여 오디오를 제어 가능

		RemoteControl.changeBattery(); // changeBattery()가 static이라 인터페이스명.메소드명()으로 호출 가능
	}
}
