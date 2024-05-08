package class7;

class Dog { // 클래스 Dog, 속성은 name과 age, 메소드는 없음.
	String name; // name은 문자열로 String, age는 정수형으로 int
	int age;
}

public class Code94 { //main 메소드가 들어간 class가 대표 클래스로 
                      // 대표 클래스 앞에는 public이 붙어야 함.
	public static void main(String[] args) {
		Dog happy = new Dog(); // 객체 happy와 bella를 생성
		Dog bella = new Dog(); // 객체 앞에 자료형 Dog(클래스형)를 붙여야 함.
		
		happy.name = "Happy";
		happy.age = 3;		
		
		bella.name = "Bella";
		bella.age = 2;
		
		System.out.println("나는 강아지 두 마리를 키웁니다.");
		System.out.println("한 마리는 이름이 " + happy.name + "이고, " + happy.age + "세입니다.");
		System.out.println("다른 한 마리는 이름이 " + bella.name + "이고, " + bella.age + "세입니다.");

	}

}
