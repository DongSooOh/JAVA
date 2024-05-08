package java11;

class Thing extends Object{ // 여기서 'extends Object' 부분은 Object 클래스가 최상위 클래스이기 때문에 생략이 가능. 
	private String name;
	private int count;
	
	Thing(){} // 디폴트 생성자
	Thing(String name, int count){
		this.name = name;
		this.count = count;
	}
	void pirnt() {
		System.out.println("name : " + name);
		System.out.println("count : " + count);
	}
	public boolean equals(Object obj) { // Object클래스의 equals을 오버라이딩, 매개변수 obj
		if (this.name.equals(((Thing)obj).name) && this.count ==((Thing)obj).count)
			return true; // 넘긴 값 th2가 Thing형이기 때문에 부모-자식 관계로 캐스트 형변환
		return false;  // Object obj = th2;
	}	//equals 메소드가 반환하는 값은 Thing 객체이며, Thing 클래스에는 name 필드가 있지만, 
	// 이것이 equals 메소드가 반환하는 객체의 필드인지 아니면 Thing 클래스 자체의 필드인지는 확실하지 않기 때문에
	// name부분에서 소괄호를 하나 더 작성

}
public class Code177 {

	public static void main(String[] args) 
	{
		Thing th1 = new Thing("desk", 5);
		Thing th2 = new Thing("desk", 5);
		
		if (th1.equals(th2)) System.out.println("Same Thing");
		else System.out.println("Different Thing");
	}
}
