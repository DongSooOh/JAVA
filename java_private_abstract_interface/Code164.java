package java910;

abstract class Parent{ // 추상 클래스
	void show() {
		System.out.println("I am parent show");
	}
	abstract void call(); // 추상 메소드(메소드 앞 abstract, 맨 뒤 ;)
}
class Child extends Parent{
	void print() {
		System.out.println("I am child print");
	}
	void call() { // call() 메소드를 오버라이딩해야 오류가 발생하지 않음
		System.out.println("I am child call");
	}
}

public class Code164 {
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		c.print();
		c.call();
	}

}
