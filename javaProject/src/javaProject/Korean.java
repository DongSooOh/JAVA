package javaProject;

public class Korean {

	// 필드
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자
	/*
		public Korean(String n, String s){ name = n; ssn = s; } 이 처럼 매개변수 값을 s, n으로
		하면 식별이 제한되어 추후 유지보수에 용이하지 않음.
	 */

	public Korean(String name, String ssn) { // 추가로 이렇게 매개변수를 2개 가진 생성자가 있을 경우
		// 자동 생성자는 호출되지 않음. 필요시 자동 생성자를 만들어야 함.(Korean(){})
		this.name = name;
		this.ssn = ssn;
	}
}
