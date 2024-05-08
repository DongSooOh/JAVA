/* 메소드 오버로딩(중복정의) 예시
   메소드 오버로딩은 앞의 반환값은 중요하지 않으나(같거나 달라도 됨),
   반드시 매개변수 부분이 달라야 함.(매개변수가 같으면 같은 메소드로 처리)
*/
public class Code91 {

	static void overMethod() {
		System.out.println("No parameters.");
	}
	static void overMethod(int x) {
		System.out.println("One parameter : " + x);
	}
	static void overMethod(int x, int y) {
		System.out.println("Two integer parameters : (" + x + "," + y + ")");
	}
	static void overMethod(int x, double y) {
		System.out.println("One integer " + x + " and the other double " + y);
	}
	
	public static void main(String[] args) {
		overMethod();
		overMethod(10);
		overMethod(5,7);
		overMethod(100, 25.5);
		

	}

}
