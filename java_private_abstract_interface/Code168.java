package java910;

interface Data1{
	int count = 100; // 상수
	void print(); // 추상 메소드
}

class ChildData implements Data1{
	public void print() { // 인터페이스의 메소드들은 public 제어를 함
		System.out.println("I am child print");
	} // 여기서 void pirnt(); 추상 메소드를 오버라이딩했는데 이렇게
}     // 부모 인터페이스에 있는 메소드를 오버라이딩할 때에는 반드시 'public'을 붙여야 함

public class Code168 {

	public static void main(String[] args) 
	{
		Data1 d = new ChildData(); // 인스턴스 d 생성
		d.print();
		System.out.println("count : " + Data1.count);
		
		

	}

}
