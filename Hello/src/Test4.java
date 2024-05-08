
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20000;
		int day=n/(24*60*60);
		int hour=(n/(60*60))%24;
		int min=(n/60)%60;
		int sec=n%60;
		
		System.out.println(day+"일"+hour+"시"+min+"분"+sec+"초");
	
		int a=10,b=2;
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
		
		int c=10,d=3;
		c%=d;
		System.out.println(c);
		
	}

}
