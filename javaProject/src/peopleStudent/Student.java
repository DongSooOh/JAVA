package peopleStudent;

public class Student extends People{
	
		public int studentNo;
		
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn); // super(): ���� Ŭ������ ������ ȣ��(�� ù ��°�ٿ� �ۼ�)
			this.studentNo = studentNo;
		}
}