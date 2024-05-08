package java12;

public class Code197 {
	
	public static void main(String args[]) 
	{
		try { // try 블록 안에는 예외가 발생하지 않는 문장
			System.out.println("hello world");
			System.out.println("inside try");
		}
		catch(Exception e) { // 예외가 발생하지 않아 catch는 출력이 안 됨
			System.out.println("I am catch");
		}
		finally { // finally가 있으므로 finally는 출력
			System.out.println("finally block");
		} 
		
	}

}
