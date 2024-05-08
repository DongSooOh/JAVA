package java910;

interface WithDefault{
	int COUNT = 100; // 상수
	void test(); // 추상 메소드
	default void show() { // 반드시 앞에 'default'가 붙어야 함.
		System.out.println("I am show");
	} // dafault 메소드로 정적 제어와는 상관 없음.
}

class Test implements WithDefault{
	public void test() { // test() 메소드는 추상 메소드로 오버라이딩
		System.out.println("I am test");
	}
}

public class Code172 {

	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		t.show();

	}

}
