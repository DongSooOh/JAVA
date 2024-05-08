
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=2753; int a,b,c,d;
		a=n/1000; n=n%1000;
		b=n/100; n=n%100;
		c=n/10; n=n%10;
		d=n%10;
		
		System.out.println("1000의 자리:"+a);
		System.out.println("100의 자리:"+b);
		System.out.println("10의 자리:"+c);
		System.out.println("1의 자리:"+d);
	}

}
