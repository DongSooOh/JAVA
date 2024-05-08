
public class PrintTest {

	public static void main(String[] args) {
		// 한 줄 주석(코드에 대한 설명, 컴파일러는 확인 불가)
		/* 
		 여러 줄 주석
		 2024-01-19 수정1
		  
		  ln은 출력 후 커서를 다음 줄에 위치
		  (자세한 차이는 아래 출력 값 확인)
		 */
		
		
		System.out.println("Hello"); //Hello 
		System.out.println("World");
		System.out.println("Java Good!");

		
		System.out.print("Hello"); //Hello 
		System.out.print("World");
		System.out.print("Java Good!");
	}
 
	int number = 42;
	String text = "The answer is " + number;

}
