package inheritance;

class Parent2{
	private int dataA;
	
	Parent2(){} // 디폴트 생성자
	Parent2(int dataA){
		this.dataA = dataA;
	}
	void printA() {
		System.out.println("dataA : " + dataA);
	}
}
class Child2 extends Parent2{
	private int dataB;
	
	Child2(){}
	Child2(int dataA, int dataB){
		super(dataA); // super 키워드를 이용, 부모 생성자 호출(첫 줄에 작성)
		this.dataB = dataB;
	}
	void printB() {
		System.out.println("dataB : " + dataB);
	}
}
public class Code134 {

	public static void main(String[] args) {
		Child2 c = new Child2(10, 20);
		c.printA();
		c.printB();

	}

}
