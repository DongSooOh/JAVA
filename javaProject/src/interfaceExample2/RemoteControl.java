package interfaceExample2;

public interface RemoteControl {

	// 상수, 앞에 'public static final' 키워드가 생략된 상태
	int MAX_VOLUME = 10;
	int MIN_VOULUME = 0;

	// 추상 메소드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드, 인터페이스명.메소드명();으로 호출
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
