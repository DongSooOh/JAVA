package javaTest;

public class BreakOutterExample {
	public static void main(String[] args) throws Exception {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);

				if (lower == 'g') {
					break Outter; // break�� ���� ����� �ݺ����� ������ �̸��� �����ϸ� �ش� �ݺ����� ����
					// �̸�(�빮��): �ݺ���, break �̸�(�빮��); ���� �ۼ�/ �̶� �̸��� �빮�ڷ� �ۼ�
				}
			}
		}
		System.out.println("1�� ���α׷� ����");

		int count = 0;

		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				count++;
			}
		}
		System.out.println("�� �ݺ� Ƚ��: " + count);
		System.out.println("2�� ���α׷� ����");
	}
}
/*
	for�� while�� ������ ������ 0ȸ, do while�� 1ȸ �ݺ� for�� �ݺ�ȸ���� ��Ȯ�� ��, while�� �ݺ�Ƚ���� ��Ȯ����
	���� ��
 */