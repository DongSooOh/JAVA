package interfaceExample2;

public interface RemoteControl {

	// ���, �տ� 'public static final' Ű���尡 ������ ����
	int MAX_VOLUME = 10;
	int MIN_VOULUME = 0;

	// �߻� �޼ҵ�
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// ����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}

	// ���� �޼ҵ�, �������̽���.�޼ҵ��();���� ȣ��
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
