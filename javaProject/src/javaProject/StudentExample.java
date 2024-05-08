package javaProject;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1의 주소값: (" + s1 + ") s1 변수가 Student 객체를 참조합니다."); // 참조(주소)

		Student s2 = new Student();
		System.out.println("s2의 참조: (" + s2 + ") s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
