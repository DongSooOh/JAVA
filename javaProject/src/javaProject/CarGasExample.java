package javaProject;

public class CarGasExample {
	public static void main(String[] args) {

		CarGas myCarGas = new CarGas(); // CarGas Ŭ����(���̺귯�� Ŭ����)�� �⺻ ������ ȣ��

		myCarGas.setGas(5); // �Ű������� �ָ鼭 CarGas Ŭ������ setGas() �޼ҵ带 ȣ��

		boolean gasState = myCarGas.isLeftGas(); // CarGas Ŭ������ isLeftGas() �޼ҵ带 ȣ��
		if (gasState) {
			System.out.println("����մϴ�.");
			myCarGas.run(); // CarGas Ŭ������ run() �޼ҵ� ȣ��
		}

		if (myCarGas.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
