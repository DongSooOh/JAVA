package java11;

class Thing2{
	private String name;
	private int price;
	
	Thing2(String name, int price){
		this.name = name;
		this.price = price;
	}
	void show() {
		System.out.println("name : " + name + ", price : " + price);
	}
}

public class Code178 {
	public static void main(String[] args)
	{
		Thing2 t = new Thing2("book", 20000);
		String s = t.toString(); // toString() 메소드는 인스턴스의 참조값 반환
		System.out.println(s); // 메소드가 오버라이딩되지 않아 참조값이 출력
		System.out.println(t);
		t.show();				
	}
}
