package java12;

public class Code198 {

	public static void main(String[] args)
	{
		int a = 5, b = 0, c;
		int A[] = new int[3];
		
		try {
				c = a / b; // ArithmeticException 발생
				A[3] = 100; // ArrayIndexOutOfBoundsException 발생
		}
		catch(ArithmeticException e) { // 여기서 걸림
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) { // 위에서 걸려서 해당 catch구문은 건너뛰고 finally로 이동
			System.out.println("없는 인덱스입니다.");
		}
		finally { // 있으면 무조건 수행
			System.out.println("finally 구문");
		}
		

	}

}
