package java12;

class MyException extends Exception{ // Exception 클래스를  
// 상속받는 클래스를 생성, MyException은 사용자가 만든 예외 클래스
	int x;
	MyException(int x){
		this.x = x;
	}
	public String toString() {
		return "I am " + x + " in MyException class";
	}
}
public class Code207 {

	public static void main(String[] args) 
	{
		MyException me = new MyException(10); // me는 예외 객체 참조 변수
		try {
			System.out.println("before throw MyException");
			throw me; // throw _; : 예외를 발생키는 키워드(이때 throw로 throws가 아님)
		}
		catch (MyException e) {
			System.out.println(e);
		}
		System.out.println("main ends");
	}
}
