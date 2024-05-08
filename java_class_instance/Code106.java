package class7;

class Personinfo
{
	String name;   // String name, int age, double height도
	int age;       // 인스턴스 변수
	double height;
	
	Personinfo(){} //() 매개변수가 없어 디폴트 생성자 호출됨.
}
public class Code106 {

	public static void main(String[] args) 
	{
		Personinfo p = new Personinfo(); // ()매개변수가 없으니 디폴트 생성자 호출
		// 클래스명 객체명(인스턴스) = new 클래스명();
		p.name = "Alice"; // 인스턴스 변수를 .(점 연산자)를 사용하여 
		p.age = 12;       // 클래스 밖에서 사용 
		p.height = 120.5;
		System.out.println("p.name : " + p.name);
		System.out.println("p.age : " + p.age);
		System.out.println("p.height : " + p.height);
		
        /* 여기서 인스턴스 p에 대해서 p.name = Alice, p.age = 12,
		   p.height = 120.5가 인스턴스 변수가 됨.
     	*/ 
	}

}
