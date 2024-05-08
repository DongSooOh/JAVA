package inheritance;

class Parent4{
	private int data = 10;
	int getData() {
		return data;
	}
}
class Child4 extends Parent4{
	int data = 20;
	
	void printData() {
		System.out.println("data from Parent4 : " + super.getData());
		System.out.println("data from Child4 : " + this.data);
		System.out.println("data from Child4 : " + data);
	}
}
public class Code137 {

	public static void main(String[] args) {
		Child4 c = new Child4();
		c.printData();
	}
}
