package javaTest;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if ((charCode >= 65) & (charCode <= 90)) { // ��Ʈ ����
			System.out.println("�빮���̱���.");
		}
		
		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ����̱���.");
		}
		
		if (!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 �����̱���.");
		}
		
		int value = 6;
		
		if ((value % 2 == 0) | (value % 3 == 0)) { // ��Ʈ ����
			System.out.println("2 �Ǵ� 3�� ����̱���.");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ����̱���.");
		}

	}

}
/* 	
	A = 4, B = 5��� �������� ��,
	��Ʈ ������ ��� 4�� '0100', 5�� '0101'�� �Ǿ� ������� '0100'(== 4)�� ����.
	(���� �ڸ����� ������ �� �� �� 1�� ��츸 1�� ��ȯ)
	��Ʈ ������ ��� ��������� '0101'(== 5)�� ����.
	(���� �ڸ����� ������ �� �� �߿� �ϳ��� 1�̸� 1�� ��ȯ)
*/
