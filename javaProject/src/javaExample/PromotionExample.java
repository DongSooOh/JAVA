package javaExample;

class A {}
class B extends A {}
class C extends A {}
class D extends B {} // 'D'클래스의 인스턴스를 'B' or 'A'타입의 변수에 할당 가능
class E extends C {} // 'E'클래스의 인스턴스를 'C' or 'A'타입의 변수에 할당 가능

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 = d; // D는 B와 A 둘 다 가능 (D → B → A)
		C c1 = e; // E는 C와 A 둘 다 가능 (E → C → A)

		// B b2 = e; // E는 B 불가(상속관계 X)
		// C c2 = d; // D도 C 불가(상속관계 X)
	}
}
