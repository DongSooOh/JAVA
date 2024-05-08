package inheritance;
// extends 키워드: (자식/유도 클래스) extends (부모/ 기본 클래스)
class Person{
	private String name;
	private String phone;
	
	Person(){}
	Person(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	
	void printPerson() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
	}
}

class Student extends Person{
	private int score;
	
	Student(){}
	Student(String name, String phone, int score){
		super(name, phone); // super는 부모 생성자를 호출하는 키워드
		this.score = score; // 초기화를 하려면 부모의 생성자를 호출해야 하기 때문에 super 사용
	}
	
	void printStudent(){
		printPerson(); // 부모 클래스의 printPerson() 메소드를 사용
		System.out.println("score : " + score);
	}
	
}

public class Code128 {

	public static void main(String[] args) 
	{
		Student s = new Student("Alice", "010-111-1111", 90);
		s.printStudent();

	}

}
