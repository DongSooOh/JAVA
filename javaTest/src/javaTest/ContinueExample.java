package javaTest;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		
		System.out.print("1���� 10������ �� �� Ȧ��: ");
		for (int j = 1; j <= 10; j++) { // 1���� 10������ �� �� Ȧ���� ����
			if (j % 2 == 0) { // j % 2 == 0: j�� ¦������ Ȯ��
				continue; // �ش� �۾��� �ǳʶٰ� ���� �ݺ� �۾��� ����
			}
			System.out.print(j + " ");
		}
		
		System.out.println();
		
		System.out.print("1���� 10������ �� �� ¦��: ");
		for (int i = 1; i <= 10; i++) { // 1���� 10������ �� �� ¦���� ����
			if (i % 2 != 0) { // i % 2 != 0: i�� Ȧ������ Ȯ��
				continue; // �ش� �۾��� �ǳʶٰ� ���� �ݺ� �۾��� ����
			}
			System.out.print(i + " ");
		}
	}
}
