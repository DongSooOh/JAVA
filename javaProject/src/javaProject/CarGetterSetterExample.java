package javaProject;

public class CarGetterSetterExample {
	public static void main(String[] args) {

		CarGetterSetter myCar = new CarGetterSetter();

		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);

		System.out.println("���� �ӵ�: " + myCar.getSpeed());

		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());

		// ����
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("���� �ӵ�: " + myCar.getSpeed());
	}
}
