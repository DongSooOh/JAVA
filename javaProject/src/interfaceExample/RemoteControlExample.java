package interfaceExample;

public class RemoteControlExample {
	public static void main(String[] args) {

		RemoteControl rc; // �������̽��� ������;���� ����(�������̽��� public ���� �����ڶ� ����)

		rc = new Television(); // Television ��ü�� ����, rc�� ����Ͽ� �ڷ������� ���� ����

		rc = new Audio(); // �����ϰ� Audio ��ü�� ����, rc�� ����Ͽ� ������� ���� ����

		RemoteControl.changeBattery(); // changeBattery()�� static�̶� �������̽���.�޼ҵ��()���� ȣ�� ����
	}
}
