package javaTest;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "�ð� " + minute + "��");
		
		// ��ȣ�� ��� �ǳ� �������� ���ؼ� ��ȣ �ۼ�
		int totalMinute = (hour * 60 ) + minute;
		System.out.println("�� " + totalMinute +"��");
	}
}