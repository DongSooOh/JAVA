package inheritance;

class Parent{
	Parent(){
		System.out.println("parent constructor is called");
	} // 1-① 부모 생성자 호출
	void printParent() {
		System.out.println("I am parent");
	} // 2-① 메소드 호출
}
class Child extends Parent{
	Child(){
		System.out.println("child constructor is called");
	} // 1-② 자식 생성자 호출
	void printChild() {
		System.out.println("I am child");
	} // 2-② 메소드 호출
}
public class Code130 {

	public static void main(String[] args) {
		Child c = new Child(); // 1 자식 객체가 생성될 때 부모 생성자부터 호출, 이후 자식 생성자 호출
		c.printParent(); // 2 메소드 호출
		c.printChild();

	}

}
