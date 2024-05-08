package class7;

class Teacher{  // 아래 int no, String name, double score는 멤버 변수
	int no;       // 정수형 데이터를 저장하는 학번을 나타내는 멤버 변수
	String name;  // 문자열 데이터를 저장하는 이름을 나타내는 멤버 변수
	double score; // 실수형 데이터를 저장하는 성적을 나타내는 멤버 변수
	
	Teacher(){}
	Teacher(int n){
		no = n;
	}
	
	void printTeacher() {
		System.out.println("no : " + no + ", name : " + name + ", score : " + score);
	}
	
}


public class Code104 {

	public static void main(String[] args) 
	{
		Teacher s1 = new Teacher(); // 디폴트 생성자가 없으므로 에러 발생
		Teacher s2 = new Teacher(10);
		
		s1.printTeacher();
		s2.printTeacher();



	}

}
