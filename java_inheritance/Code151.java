package inheritance;

class Person2{
	private String name;
	Person2(){}
	Person2(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	void print() {
		System.out.println("I am " + name);
	}
}
class Teacher extends Person2{
	private String subject;
	Teacher(){}
	Teacher(String name, String subject){
		super(name);
		this.subject = subject;
	}
	void print() {
		System.out.println("I am " + getName() + " and I teach " + subject + ".");
	}
}
class Student2 extends Person2{
	private String year;
	Student2(){}
	Student2(String name, String year){
		super(name);
		this.year = year;
	}
	void print() {
		System.out.println("I am " + getName() + " and I am " + year + ".");
	}
}

public class Code151 {

	public static void main(String[] args) {
		Person2 p1 = new Teacher("Alice", "Math"); // p1과 p2는 Person2 형태의 인스턴스
		Person2 p2 = new Student2("David", "Sophomore");
		
		p1.print(); // Person2 형으로 print가 되어야 하나 void print()가 오버라이딩되어 Teacher 클래스의 print가 출력됨
		p2.print(); // 위와 동일하게 오버라이딩되어 Student2의 print()가 출력이 됨.

	}

}
