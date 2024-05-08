package class7;

class Person{
	static int count; // 클래스 변수(정적 변수)
	String name;
	
	Person(){
		count ++;
	}
	
	static void printCount() {
		System.out.println("count : " + count); // count는 위에서 static으로 선언
		//System.out.println("name : " + name); static 선언되지 않아 오류
	}
}
public class Code115 {

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		Person p2 = new Person();
		Person.printCount(); // '클래스명.메소드명()'으로 작성(일반적)
		p1.printCount();     // '인스턴스명.메소드'()로 작성
		p2.printCount();

	}

}
