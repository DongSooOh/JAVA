package class7;
// private 접근 제어자 : 같은 클래스 내에서만 접근이 가능
class Book2{
	private String title;
	private int price;
	
	Book2(){}
	Book2(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	void printBook2() {
		System.out.println("title : " + title);
		System.out.println("price : " + price);
	}
}

public class Code119 {

	public static void main(String[] args)
	{
		Book2 bk = new Book2("Java programming", 25000);
		bk.printBook2();
		// bk.price = 27000; 다른 클래스로 에러 발생
		// The field Book.price is not visible.

	}

}
