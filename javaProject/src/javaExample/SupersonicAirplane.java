package javaExample;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // static ����� 'Ŭ������.�����'���� ȣ���� ����(SupersonicAirplan.NORMAL)
	public static final int SUPERSONIC = 2; // �����ϰ� 'SupersonicAirplane.SUPERSONIC'���� ȣ��

	public int flyMode = NORMAL; // 'static'�� ���� �ν��Ͻ� ����� '��ü��.�����'���� ȣ��

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("������ �����մϴ�.");
		} else {
			super.fly(); // �θ� Ŭ����(Airplane)�� fly() �޼ҵ� ȣ��
		}
	}
}
