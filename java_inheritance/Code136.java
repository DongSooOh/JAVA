package inheritance;

class Parent3{
	int data = 10;
}
class Child3 extends Parent3{
	int data = 20;
	
	void printData() {
		System.out.println("data from Parent3 : " + super.data);
		System.out.println("data from Child3 : " + super.data);
		System.out.println("data from Child3 : " + data); // 동일한 경우 우선순위는 자식부터
	}
}
public class Code136 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.printData();

	}

}
