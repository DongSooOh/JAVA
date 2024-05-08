package class7;

class Student{ // Student 클래스는 학생의 세 개의 멤버 변수(학번, 이름, 성적)를 나타냄.
	int no;        // 학번   멤버 변수는 클래스 내부에 선언된 변수들을 의미.
	String name;   // 이름   예시로 'int no', 'String name', 'double score'
	double score;  // 성적   위 세 개가 멤버 변수에 해당됨.
	
	void printStudent() { // printStudent는 학생의 정보를 출력하는 메소드
		System.out.println("no : " + no);
		System.out.println("name : " + name);
		System.out.println("score : " + score);
		
	}
	void updateScore(double change) { // 성적을 업데이트하는 메소
		score += change;
	}
}

public class Code95 {

	public static void main(String[] args) {
		 
		 Student s1 = new Student();
		 s1.no = 10;
		 s1.name = "Alice";
		 s1.score = 92.5;
		 
		 Student s2 = new Student();
		 s2.no = 20;
		 s2.name = "David";
		 s2.score = 88.2;
		 
		 s1.printStudent(); 
		 s2.printStudent(); // 최초 각 학생의 정보를 출력
		 
		 s1.updateScore(+2.3); // 업데이트 실행
		 s2.updateScore(-1.5);
		 System.out.println("---------------");
		 s1.printStudent(); // 업데이트된 정보를 출력
		 s2.printStudent();
		 
	}

}
