package javaProject;

public class FieldInitValueExample {
	public static void main(String[] args) {

		FieldInitValue fiv = new FieldInitValue();

		// 객체 내부에서는 '필드명'으로 접근이 가능
		System.out.println("byteField: " + fiv.byteField); // 외부에서 접근할 때는 '변수명.필드명'
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);

		System.out.println("booleanField: " + fiv.booleanField);

		System.out.println("charFiedl: " + fiv.charField);

		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);

		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
