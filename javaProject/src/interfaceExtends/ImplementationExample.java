package interfaceExtends;

public class ImplementationExample {
	public static void main(String[] args) {

		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA(); // ia.methodB(); or id.methodC();는 불가
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB(); // ia.methodA(); or id.methodC();는 불가
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
