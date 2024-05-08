
public class Boolean {
	public static void main(String[] args) {
		
		int a=50,b=30,c=60;
		boolean b1=a>b;
		boolean b2=b>c;
		boolean b3=a>=c;
		boolean b4=b<=c;
		boolean b5=a==b;
		boolean b6=a!=b;
		
		System.out.println(b1+" "+b2+" "+b3);
		System.out.println(b4+" "+b5+" "+b6);
		
		int w=10,x=20,y=30,z=15;
		boolean a1=w>x&&y>z;
		boolean a2=w!=x||y<=z;
		boolean a3=w<=x||y<=z;
		System.out.println(a1+" "+a2+" "+a3);
	
	}
}
