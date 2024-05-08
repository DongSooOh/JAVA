package javaExample;

class A {}
class B extends A {}
class C extends A {}
class D extends B {} // 'D'Ŭ������ �ν��Ͻ��� 'B' or 'A'Ÿ���� ������ �Ҵ� ����
class E extends C {} // 'E'Ŭ������ �ν��Ͻ��� 'C' or 'A'Ÿ���� ������ �Ҵ� ����

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

		B b1 = d; // D�� B�� A �� �� ���� (D �� B �� A)
		C c1 = e; // E�� C�� A �� �� ���� (E �� C �� A)

		// B b2 = e; // E�� B �Ұ�(��Ӱ��� X)
		// C c2 = d; // D�� C �Ұ�(��Ӱ��� X)
	}
}
