import java.util.Scanner;
public class Code58 {

	public static void main(String[] args) {
		int a;
		for (a = 1; a <= 3; a++)
		{
			int x = 100;
			System.out.println(a + x);
		}
		System.out.println("a :" + a);
		
		Scanner scin = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = scin.nextInt();
		int count = 0;
		for(int i = 1 ; i <= n ; i ++) {
			
			if (n % i == 0)
				count ++;
		} scin.close();
		if (count == 2)
			System.out.println(n + "은 소수입니다.");
		else
			System.out.println(n + "은 합성수입니다.");
  /* if (n % i == 0)과 count ++; 부분을 통해서 n을 i로 지속해서 나누었을 때,
     나머지가 0이 되면 그것을 count 변수가 세고, 나중에 count가 2이면 1과 자신이라 소수,
     그 외의 경우는 합성수로 판단. 
		*/
		int d = 1;
		do {
			System.out.println("Hello World");
			d ++;
		} while(d <= 5);
	} 

}
