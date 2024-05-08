package java12;

public class Code193 {

	public static void main(String[] args) 
	{
		int a=5, b=0, c;
		c = a / b;
		System.out.println("c : " + c);
		

	}

}
/*
	Exception in thread "main" java.lang.ArithmeticException(산술 예외가 발생): 
	/ by zero (0으로 나누어서 예외가 발생)
	at java12.Code193.main(Code193.java:8)

*/
