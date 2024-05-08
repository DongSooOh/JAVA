
public class Test05 {
	public static void main(String[] args) {
		/*  정수 연산의 최소 단위는 int로 
		    byte나 short는 int로 변환
		*/
		
		int x1=10,x2=20,x3;
		x3=x1+x2;
		System.out.println("x:"+x3);
		
		int a=10, b=20, c=5, d;
		d=a++ + --b + ++c;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		
		// 시프트 연산자
		int z=20,e=2;
		int r1=z>>e;
		int r2=z>>>e;
		int r3=z<<e;
		
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
		System.out.println("r3:"+r3);

	}
}
