package class7;

class Book{
	String title;
	int price;
	
	Book(String title, int price){
		this.title = title;  // this 키워드를 이용하여 b1을 생성할 때 
		this.price = price;  // this는 인스턴스 b1을 가리킴
	}   
}

public class Code111 {

	public static void main(String[] args) 
	{
		Book b1 = new Book("Peter Pan", 10000);
		Book b2 = new Book("Aladdin", 9000);
		
		System.out.println(b1.title + ", " + b1.price);
		System.out.println(b2.title + ", " + b2.price);

	}

}
