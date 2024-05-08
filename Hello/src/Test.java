
public class Test {

	public static void main(String[] args) {

		int a=33, b=25;
		System.out.println(a+"hello"); //Hello 
		System.out.println(a+"hello"+b);
		System.out.println(a+b+"hello");
		System.out.println(a+b+"hello");
		System.out.println(a+b+"hello"+a+b);
		System.out.println(a+b+"hello"+(a+b));

		
		boolean x=true;
		boolean y=false;
		System.out.println(x);
		System.out.println(y);
		
		y=5>10;
		System.out.println(y);
		y=5<10;
		System.out.println(x);
		
		//아스키코드 A=65, B=66, ---. 
		//a=97, b=98, ---.으로 나열됨.
		char c1='A',c2='a', c3='B', c4='b';
		System.out.println((int)c1);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		
		
		
		
	}

}
