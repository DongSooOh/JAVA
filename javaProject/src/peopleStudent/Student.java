package peopleStudent;

public class Student extends People{
	
		public int studentNo;
		
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn); // super(): 상위 클래스의 생성자 호출(맨 첫 번째줄에 작성)
			this.studentNo = studentNo;
		}
}