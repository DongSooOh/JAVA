package javaAPI;

public class StringCharAtExample {
	public static void main(String[] args) {
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 7��° �ε����� ���� ����
		switch (sex) {
			case '1': // 7��° �ε����� ���� 1 �Ǵ� 3�̸�
			case '3': // char������ ���� ����ǥ(') ǥ��
				System.out.println("�����Դϴ�.");
				break;
			case '2': // 7��° �ε����� ���� 2 �Ǵ� 4��
			case '4':
				System.out.println("�����Դϴ�.");
				break;
		}
	}
}
