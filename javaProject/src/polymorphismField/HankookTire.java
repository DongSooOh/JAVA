package polymorphismField;

public class HankookTire extends Tire {

	// �ʵ�

	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // super() �޼ҵ�� Tire�� ������ ȣ��
	}

	// �޼ҵ�
	@Override // �޼ҵ尡 ��Ȯ�� �����ǵ� ������ �����Ϸ��� Ȯ��
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("********** " + location + " HankookTire ��ũ **********");
			return false;
		}
	}
}
