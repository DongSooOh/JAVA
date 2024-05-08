package java14;

class Data<T>{ // 클래스명 옆에 제네릭 기호 '<>'를 적고 그 안에 매개변수 'T' 작성
	T obj; // 인스턴스 변수 obj의 자료형은 T임, d1의 경우 Integer obj(100);이 되고 d2의 경우 String obj("JAVA");가 됨
	Data(T ob){ // 생성자 Data는 자료형이 T인 인수 한개를 입력받음
		obj = ob; // ob = obj이고 obj의 자료형은 T임
	}
	T getObj() { // 인스턴스 변수 obj의 자료형은 T임
		return obj;
	}
	void  showType() {
		System.out.println("Type of T : " + obj.getClass().getName());
	}
}
public class Code229 {

	public static void main(String[] args) {
		Data<Integer> d1 = new Data<Integer>(100); // 정수 100 인수
		System.out.println(d1.getObj());
		d1.showType(); // Integer의 풀네임인 java.lang.Integer가 출력
		
		Data<String> d2 = new Data<String>("JAVA"); // 문자열 "JAVA" 인수
		System.out.println(d2.getObj());
		d2.showType(); // String의 풀네임인 java.lang.String이 출력
	}
}
