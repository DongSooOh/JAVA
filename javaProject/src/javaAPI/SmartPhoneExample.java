package javaAPI;

public class SmartPhoneExample {
	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");

		String strObj = myPhone.toString();

		System.out.println(strObj);
		System.out.println(myPhone); // ��ü ȣ�� �� toString() ȣ��Ǿ� ��ü�� ���ڿ� ǥ���� ��ȯ
		// System.out.println(myPhone.toString());�� ����

	}
}
