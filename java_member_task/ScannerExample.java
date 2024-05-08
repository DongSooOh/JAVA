// Scanner 클래스
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scin=new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
		int x=scin.nextInt();
		System.out.println("실수를 입력하시오: ");
		double y=scin.nextDouble();
		System.out.println("이름을 입력하시오: ");
		String name=scin.next();
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("name: "+name);
		
		scin.close();
	}
	
}