package javaExample;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane(); // sa ��ü ����

		sa.takeOff();	// ��ü��.�޼ҵ������ ȣ��
		sa.fly();
		// 'flyMode'�� �ν��Ͻ� ����� ��ü��.�ν��Ͻ� ��������� ȣ���Ͽ���
		// 'SUPERSONIC'�� ����ƽ ����� Ŭ������.����ƽ ��������� ȣ��
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}