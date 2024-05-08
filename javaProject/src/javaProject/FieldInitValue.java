package javaProject;

public class FieldInitValue {

	// 필드
	byte byteField; // byte, short, int 초기값: 0
	short shortField;
	int intField;
	long longField; // 초기값: 0L

	boolean booleanField; // 초기값: false

	char charField; // 초기값: \u0000(빈 공백)

	float floatField; // 초기값: 0.0F
	double doubleField; // 초기값: 0.0

	int[] arrField; // int[]도 객체(배열), 초기값: null
	String referenceField; // String은 객체(문자열), 초기값: null
}
/*
	byte, short, int, long, float, double, char, boolean은 원시 데이터 타입으로 기본적인 데이터 형식
	기본 타입의 초기값은 byte, short, int는 '0', long은 '0L', char는 '\u0000(빈 공백이 출력)',
	float는 '0.0F', double은 '0.0', boolean은 'false'.

	int[](배열), String(클래스), 인터페이스는 참조 타입으로 객체를 의미. 초기값은 'null'
 */