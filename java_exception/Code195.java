package java12;

public class Code195 {
	
	public static void main(String args[]) 
	{
		int a=5, b=0, c;
		try {
				c = a / b; // 에러가 발생할 가능성 있는 코드
				System.out.println("c : " + c); // 위의 코드에 영향을 받는 코드
		}
		catch(ArithmeticException e) { // try 블록 안에서 ArithmeticException가 발생할 수 있습니다.
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

}
