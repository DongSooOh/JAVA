package java13;

import java.io.IOException;

public class Code209A {

	public static void main(String[] args)
	{
		System.out.print("문자열을 입력하세요. : ");
		int x;
		try {
				while((x = System.in.read()) != -1) {
					// 위에서 읽어들일 문자가 없으면 -1을 반환
					System.out.print((char)x);
				}				
		}
		catch(IOException e) {
				e.printStackTrace();
		}
	}
}