package javaTest;

public class IndexOfContainsExample {
	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���"); // ������ '��'�� �ε��� 3���� 3�� ��ȯ
		System.out.println(location);
		String substring = subject.substring(location); // location���� '���α׷���'�� �� ����
		System.out.println(substring);
		
		location = subject.indexOf("�ڹ�"); // 1
		
		if (location != -1){ // �ڹ� ���� ���� Ȯ��
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ������ ���� å�̱���.");
		}
		
		boolean result = subject.contains("�ڹ�"); // contains(): �ش� ���ڿ��� �����ϰ� �ִ��� Ȯ��
		
		if(result) {
			System.out.println("�ڹٿ� ���õ� å�̱���.");
		} else {
			System.out.println("�ڹٿ� ������ ���� å�̱���.");
		}
	}
}
