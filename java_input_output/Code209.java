package java13;

import java.io.IOException;

public class Code209 {

	public static void main(String[] args)
	{
		System.out.println("Enter one character : ");
		int x;
		try {
				x = System.in.read();
				System.out.println("You entered " + x);
				System.out.println("You entered " + ((char)x)); // read() 메소드의 반환값은 
				// int형이기 때문에 char형으로 형변환하여야 영문자로 출력
		}
		catch(IOException e) {
				e.printStackTrace();
		}
	}
}
// 입출력에는 에러가 발생할 수 있으므로 예외처리를 해주어야 함.