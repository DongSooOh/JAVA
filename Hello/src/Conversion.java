
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long x=10000L;
		float y;
		y=x;
		System.out.println("y: "+y);
		
		double z;
		z=x;
		System.out.println("z: "+z);
		
		/*asciiValue 'A'=65, 'a'=97
		코드에서 b=c; 부분에서는 char 타입인 변수 c의 값을 int 타입인 변수
		b에 대입. 이때 자동으로 형변환이 일어나며, char의 아스키코드 값이 
		int로 변환. 따라서 b에는 'a'의 아스키코드 값인 97이 저장. 이후에 
		System.out.println("b: "+(char)b);에서는 (char)b를 통해 
		다시 int에서 char로 형변환을 수행. 이때 아스키코드 값인 97이 char로
		변환되면서 해당 아스키코드에 해당하는 문자가 출력. 따라서 "b: a"가 
		출력. 즉, 두 번째 출력에서 (char)b를 통해 아스키코드 값에서 해당하는
		문자로 변환되기 때문에 "a"가 출력.
		*/
		char c='a';
		int b;
		b=c;
		System.out.println("b: "+b);
		System.out.println("b: "+(char)b);
		
	}

}
