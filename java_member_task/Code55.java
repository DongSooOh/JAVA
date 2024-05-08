import java.util.Scanner;
public class Code55 {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();	
		while(n>0){
		  int m = n % 10;
		    System.out.println(m); // 입력한 값의 일의 자리부터 하나씩 출력
		    n /= 10;
		    } scin.close();
		//하나의 양의 정수를 입력받아서 각 자리수를 떼어서 출력
		
		
		int i;
		int sum = 0;
		for( i = 1; i <= 10; i++ )
		{
			sum += i;
		}
		System.out.println("sum :" + sum);
		  }
		}
// 1부터 10까지의 수를 다 더한 값 

