package class7;

class Book1{
	String title; // 속성, 인스턴스 변수
	int price;
	
	Book1(){} // 디폴트 생성자
	
	Book1(String title){ // 매개변수를 1개 갖고 있는 생성자
		this.title = title;
	}
	
	Book1(String title, int price){ // 매개변수를 2개 갖고 있는 생성자
		this(title); // 반드시 첫 줄에서만 사용, 오류 발생
		this.price = price;
	}
}
public class Code112 {

	public static void main(String[] args) {
		Book1 b = new Book1("Java", 25000);
		
		System.out.print(b.title + ", " + b.price);

	}

}
