package javaTest;

public class ReplaceExample {
	public static void main(String[] args) {
		
		String oldStr = "�ڹ� ���ڿ��� �Һ��Դϴ�. �ڹ� ���ڿ��� String�Դϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA"); 
		// replace(A, B): ���ڿ����� A���ڸ� B���ڷ� ��ȯ �� ����� ���ڿ��� ��ȯ
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
