package javaTest;

public class StringExample {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		String job = "���α׷���";
		
		System.out.println(name);
		System.out.println(job);
		
		String str = "���� \"�ڹ�\"�� ���ϴ�."; // "����Ϸ��� \"�� ǥ��
		System.out.println(str);
		
		str = "��ȣ\t�̸�\t����";
		System.out.println(str);
		
		System.out.println("����\n");
		System.out.println("�ڹٸ�\n");
		System.out.println("���ϴ�.");
	}

}
/*
 	�̽������� ����(\)
 	\t : ��
 	\n : �� �ٲ�(���� �ǵ�)
 	\r : ĳ��������
 	\" : " ���
 	\' : ' ���
 	\\ : \ ���
 	\u16���� : 16���� �����ڵ忡 �ش��ϴ� ���� ���
*/
