package javaTest;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		// 괄호가 없어도 되나 가독성을 위해서 괄호 작성
		int totalMinute = (hour * 60 ) + minute;
		System.out.println("총 " + totalMinute +"분");
	}
}