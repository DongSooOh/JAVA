package polymorphismCasting;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		parent.field2 = "data2"; 	// 불가능
		parent.method3(); 			// 불가능
		*/
		
		Child child = (Child) parent; // 강제 타입 변환
		child.field2 = "yyy"; 
		child.method3();
		
		child.method1(); // 강제 타입 변환을 해도 기존에 갖고 있던 권한을 가지게 됨
		child.method2();
		System.out.println(child.field1);
		System.out.println(child.field2);
	}
}
