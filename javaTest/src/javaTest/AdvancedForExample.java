package javaTest;

public class AdvancedForExample {
	public static void main(String[] args) {

		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		
		/* for ( Ÿ�� ���� : �迭 ){ // �̶� �����ݷ�(;)�� �ƴ�, �ݷ�(:)�� ��� ��
		 			���๮
		   } */
		System.out.println("���� ����: " + sum);

		double avg = (double) sum / scores.length; // sum�� int������ �Ͻ������� double������ ��ȯ��
		System.out.println("���� ���: " + avg);

	}

}
