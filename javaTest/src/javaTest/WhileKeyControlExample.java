package javaTest;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) { // 10 : �� �ٲ�, 13: ĳ���� ����(���� ���� ������ �� Ŀ���� ���� �������� �̵�)
				System.out.println("-------------------------------");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("-------------------------------");
				System.out.println("����: ");
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) { // 49: 1, 48: 0
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) { // 50: 2
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) { // 51: 3
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
// ** �����ڵ� ����ǥ 10: �� �ٲ�, 13: ĳ���� ����, 48: 0, 65: A, 97: a **