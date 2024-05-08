package java11;

import java.util.Random;

public class Code191 {

	public static void main(String[] args)
	{
		Random rand1 = new Random(); // Random 클래스 생성 후 rand1 객체에 담음
		Random rand2 = new Random();
		
		for (int i = 0; i < 3; i++)
			System.out.println(rand1.nextInt() + " ");
		System.out.println();
		// '-', '0', '+' 포함한 정수(Int) 범위 내에서 임의의 값을 3번 출력
		// Int의 범위(-2^31 ~ 2^31-1)
		for (int i = 0; i < 3; i++)
			System.out.println(rand2.nextInt(100) + " ");
		// 100의 범위(0~99) 중에서 임의의 값을 3번 출력

	}

}
