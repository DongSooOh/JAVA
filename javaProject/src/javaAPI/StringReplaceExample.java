package javaAPI;

public class StringReplaceExample {
	public static void main(String[] args) {

		String oldStr = "�ڹٴ� ��ü�������Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA"); // replace(���� ��� ���ڿ�, ������ ���ڿ�)

		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
