/* Run 후에 Console 창에 표기되는 Enter n : 아래에 50 입력 시
   50의 약수가 나옴
*/
import java.util.Scanner;
public class Code54 {
	public static void main(String[] args){
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int a = 1;	
		while(a<=n){
		  if(n%a==0) {
	        System.out.print(a+" ");
		  }
		  a+=1;
		}
		scin.close();
			}

}
 

