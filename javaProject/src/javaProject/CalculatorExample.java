package javaProject;

public class CalculatorExample { // ���� Ŭ����(main() �޼ҵ� ����)
	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // �⺻ ������ ȣ��
		// Calculator Ŭ����(���̺귯�� Ŭ����)�� ��ü�� �����Ǿ� �ش� Ŭ������ ����� ��� �޼ҵ���� ȣ���� �� ����
		myCalc.powerOn(); // powerOn() �޼ҵ� ȣ��

		int result1 = myCalc.plus(5, 6); // �Ű������� �ָ鼭 plus() �޼ҵ� ȣ��
		System.out.println("result1: " + result1);

		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // ���� �����ϰ� �Ű������� �����ָ� divide() �޼ҵ� ȣ��
		System.out.println("result2: " + result2);

		myCalc.powerOff(); // powerOff() �޼ҵ� ȣ��
	}
}
