package practice;

public class StudentClassPractice {
	public static void main(String[] args) {
		for (int m = 1; m <= 6; m++) {
			System.out.println("----- " + m + "학년 -----" );
			
			for (int n = 1; n <= 5; n++) {
				System.out.println(m + "학년 " + n + "반");
			}
		}
	}
}