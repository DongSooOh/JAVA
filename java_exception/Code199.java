package java12;

public class Code199 {

	public static void main(String[] args)
	{
		int a = 5, b = 0, c;
		int A[] = new int[3];
		
		try {
				A[3] = 100; // ArrayIndexOutOfBoundsException 먼저 발생
				c = a / b; 
				
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) { // ArrayIndexOutOfBoundsException이 없지만 
			                 //Exception 클래스가 상위 클래스이기 때문에 여기서 걸림
			System.out.println("없는 인덱스입니다.");
		}
		finally { // 있으면 무조건 수행
			System.out.println("finally 구문");
		}
	}
} 	// 위와 같이 catch 괄호에 넣는 예외 간에 상속 관계가 성립될 경우 상위 예외를 더 나중에 작성
  	// 만약 상위 예외 클래스를 먼저 작성할 경우 컴파일 에러가 발생
	// 따라서 예외 작성 중 catch 구문에는 하위 예외부터 작성