package practice;

public class MovieTicketPractice {
	public static void main(String[] args) throws Exception {

		boolean movie = true;
		int ticket = 0;
		int keyCode = 0;

		System.out.println("��ȭ ���� ���α׷�");

		while (movie) {
			if (keyCode != 13 && keyCode != 10) { // 10: �� �ٲ�, 13: ĳ���� ����

				System.out.println("------------------------------------");
				System.out.println("1. ��ȭ ���� | 2. ���� ��� | 3. ����");
				System.out.println("------------------------------------");
				System.out.println("����: ");
			}
			keyCode = System.in.read();

			if (keyCode == 49) { // 49: 1, 48: 0
				ticket++;
				System.out.println("��ȭ ���Ű� �Ϸ�Ǿ����ϴ�. ���� ���ŵ� ��ȭ�� " + ticket + "�� �Դϴ�.");
			} else if (keyCode == 50) { // 50: 2
				if (ticket > 0) {
					ticket--;
					System.out.println("��ȭ ���Ű� ��ҵǾ����ϴ�. ���� ���ŵ� ��ȭ�� " + ticket + "�� �Դϴ�.");
				} else {
					System.out.println("����� ���Ű� �����ϴ�.");
				}
			} else if (keyCode == 51) { // 51: 3
				movie = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
//** �����ڵ� ����ǥ 10: �� �ٲ�, 13: ĳ���� ����, 48: 0, 65: A, 97: a **