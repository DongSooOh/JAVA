package java11;

class Thing3{
	private String name;
	private int price;
	Thing3(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String toString() { // toString() 오버라이딩
		return "name : " + name + ", price : " + price;
	}
}
public class Code179 {

	public static void main(String[] args) 
	{
		Thing3 t = new Thing3("book", 20000);
		String s = t.toString();
		System.out.println(s); // toString 자동호출
		System.out.println(t); // == println(t.toString());
	}
}
