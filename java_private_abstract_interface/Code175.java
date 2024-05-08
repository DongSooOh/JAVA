package java910;

interface WithPrivate{ 
	default int getData() { // 디폴트 메소드
		print(); // 추상 메소드
		return get() + 100;
	}
	
	private void print() {
		System.out.println(get());
	}
	private int get() {
		return 100;
	}
}

class Test4 implements WithPrivate{
	void test() {
		int x = getData(); // 디폴트 메소드 호출, 부모라 호출 가능
		System.out.println("x : " + x);
	}
}
public class Code175 {

	public static void main(String[] args) {
		Test4 t = new Test4();
		t.test();

	}

}
