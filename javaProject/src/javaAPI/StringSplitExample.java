package javaAPI;

public class StringSplitExample {
	public static void main(String[] args) {
		
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		/*
			split(): ����ǥ������ �����ڷ� �ؼ� �κ� ���ڿ��� �и� �� '�迭'�� ����
			|: split() �޼ҵ忡�� �����ڸ� 2�� �̻� ����� �� �����ڵ��� �����Ͽ� ���ڿ��� ��������
		*/
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
