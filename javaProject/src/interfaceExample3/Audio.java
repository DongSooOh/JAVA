package interfaceExample3;

public class Audio implements RemoteControl {

	// 필드
	private int volume;
	private boolean mute;

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOULUME) {
			this.volume = RemoteControl.MIN_VOULUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	@Override // @Override 어노테이션: 메소드가 정확히 재정의된 것인지 컴파일러가 확인
	public void setMute(boolean mute) { // 디폴트 메소드 오버라이딩
		this.mute= mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
