package polymorphismCasting;

public class InstanceOfExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { // instanceof ��ȿ�� ��
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - Child�� ��ȯ ����");
		}
	}
	
	public static void method2(Parent parent) { // ���� ����� �ƴ�(��ȿ�� �� ����)
		Child child = (Child) parent;
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent(); // Parent Ŭ������ �ν��Ͻ��� ���� Ÿ�� ��ȯ�� �Ұ���(ClassCastException)
		// ���� 'Ÿ��' ��ȯ�̶� �ش� Ŭ������ �ν��Ͻ��̳� Ÿ���� �ٸ� ��츸 ĳ��Ʈ �������� ���� ��ȯ�� �����ϰ�, Ŭ������ �ٸ��� ���� �߻� 
		method1(parentB);
		method2(parentB); // ���� �߻�(InstanceOfExample.java_ ��ü Ÿ�� Ȯ��)
		// parentB�� Parent Ŭ������ �ν��Ͻ��̹Ƿ� Child Ÿ������  
	}
}