package class7; // 캡슐화, 접근자 및 변경자

class Book3{
	private String title; // private 접근 제어자,
	private int price;    // 인스턴스 변수
	
	Book3(){} // 디폴트 생성자
	Book3(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	String getTitle() { // title 접근자
		return title;
	}
	int getPrice() { // price 접근자
		return price;
	}
	void setTitle(String title) { // title 변경자
		this.title = title;
	}
	void setPrice(int price) { // price 변경자
		this.price = price;
	}
	void printBook3() {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}

}

public class Code121 {

	public static void main(String[] args) 
	{
		Book3 bk = new Book3("Java Programming", 25000);
		bk.printBook3();
		bk.setTitle("Jave Programming 2"); // 변경자 호출
		bk.setPrice(27000); // 변경자 호출
		System.out.println("title : " + bk.getTitle()); // 접근자 호출
		System.out.println("price : " + bk.getPrice()); // 접근자 호출
		

	}

}
