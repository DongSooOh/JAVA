package javaProject;

public class ComputerExample {
	public static void main(String[] args) {

		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 }; // 1��,
		int result1 = myCom.sum1(values1); // 2�� �̷��� 2�ٷ� �����ؼ� �ۼ��ϴ� ���� ��ȣ
		System.out.println("result1: " + result1);

		int result2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5 }); // ��ȣ�ϴ� ����� �ƴ�
		System.out.println("result2: " + result2);

		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);

		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);

	}

}
