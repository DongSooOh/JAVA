package javaExample;

public class Computer extends Calculator {
	@Override // @Override ������̼�: �޼ҵ尡 ��Ȯ�� �����ǵ� ������ �����Ϸ��� Ȯ���Ͽ� �������� �Ǽ��� �ٿ���
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r * r; // PI�� ����ƽ ���(Ŭ������.����ƽ �����)
		// �ܺο��� ��ü ���� ���̵� ȣ���� ����
	}
}