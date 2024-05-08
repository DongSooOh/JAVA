
public class Test2 {
	public static void main(String[] args) {
		
		// ++ 혹은 --를 사용하여 해당 아스키코드 or 유니코드에서
		// 1을 더하거나 뺌.
		// 동일한 표현식으로는 '++'는 '+=1'과 같고, '--'는 '-=1'과 같음.
		// 추가로 '+=', '-='는 각각 '+=2, 3, ---'과 같이 표현할 수 있음.
	
		char x='A', y='B';
		x++;
		y--;
		System.out.println(x);
		System.out.println((int)x);
		System.out.println(y);
		System.out.println((int)y);
		
		// 범위를 넘어가면 에러가 됨.
		// (byte뿐만 아니라, short, int, long 전부 해당됨.)
		// int 범위(-2,147,483,648~2,147,483,647)를 벗어난 수를
		// 저장할 때에는 L 또는 l을 붙여야 함.(그렇지 않으면 오류 발생) 
	
		
		byte b=126;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b++;
		System.out.println(b);
		b--;
		System.out.println(b);
		b--; 
		System.out.println(b);
		b--;
		System.out.println(b);
		
        float f1=5.3F;
        float f2=3.775f;
        float f3;
        f3=f1+f2;
        System.out.println(f3);
        
        double d1=5.3;
        double d2=3.775;
        double d3;
        d3=d1+d2;
        System.out.println(d3);
		
        String myName="Peter Pan";
        String yourName="피터팬";
        System.out.println("I am "+myName+".");
        System.out.println("You are "+yourName+".");

		
	}

}
