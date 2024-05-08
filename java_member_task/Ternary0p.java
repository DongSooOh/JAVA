import java.util.Scanner;
public class Ternary0p {

	public static void main(String[] args) {
		int a=8, b=5;
		
		System.out.println("두 수의 차는 "+((a>b)?(a-b):(b-a)));

		
		int x=1;
		while(x<=5) {
			System.out.println("Hello World");
			x++;
		}
		/* while 반복문을 이용해서 1~10까지의 합을 구함.
		마지막 a=10까지만 되고, 이후 a+=1;을 하게 되면 11으로 while(F)가 되어
		System.out.println("sum: "+sum);에 대해서 수행하면서 마침.
		*/
		int w=1;
		int sum=0;
		while(w<=10){
			sum+=w;
			w+=1;
		}
		System.out.println("sum: "+sum);
		
		Scanner scin=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=scin.nextInt();
		int h=1;
		
		System.out.print("Factors of " + n + ": ");
		
		while(h<=n) {
			if(n%h==0)
				System.out.print(h+" ");
			h+=1;
		}
		scin.close();
			}
	}
