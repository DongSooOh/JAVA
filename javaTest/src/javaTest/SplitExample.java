package javaTest;

public class SplitExample {
	public static void main(String[] args) {

		String board = "1,�ڹ� �н�,���� Ÿ�� String�� �н��մϴ�.,ȫ�浿";

		String[] tokens = board.split(","); // board ���ڿ��� ,�� �����Ͽ� ������� tokens �迭�� ����
		// ���ڿ�.split(): ���ڿ��� �Ű������� �����Ͽ� ������� �迭 ��ü�� ����.

		// �迭�� �ε������� �б�
		System.out.println("��ȣ: " + tokens[0]);
		System.out.println("����: " + tokens[1]);
		System.out.println("����: " + tokens[2]);
		System.out.println("����: " + tokens[3]);
		System.out.println();

		// �� ������ for �ݺ����� ����Ͽ� �б�
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
