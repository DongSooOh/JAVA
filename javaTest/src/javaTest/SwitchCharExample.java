package javaTest;

public class SwitchCharExample {
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a': // ��ҹ��ڸ� �������� �ʵ��� ��ҹ��� �� �� �ۼ�
				System.out.println("��� ȸ���Դϴ�.");
				break;
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}

	}

}
