package inheritance;

class Data1{
	void print() {
		System.out.println("class Data1 print method");
	}
}
class Data2{
	void show() {
		System.out.println("class Data2 show method");
	}
}
public class Code152 {

	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2();
		
		if (d1 instanceof Data1)
			d1.print();
		
		if (d2 instanceof Data2)
			d2.show();

	}

}/* instanceof 연산자(인스턴스명 instanceof 클래스명)을 사용할 때 
    boolean-true,false 혹은 if(인스턴스명 instanceof 클래스명) else로도 사용
*/
