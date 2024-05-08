/*가변 인수 작성 시 
 매개변수 선언에서 타입과 가변 인수를 나타내는 '...'를 붙여서 사용
 따라서 'int...'처럼 붙여서 사용/ 추가) 인수(= 매개변수, parameter) */
public class Code89 {

	public static void varArgTest(int...v) 
	{
	    System.out.println("number of arguments : " + v.length);
	    for (int i = 0; i < v.length; i++)
	    	System.out.println(v[i]);
	}
	
	
	public static void main(String[] args)
	{
	    varArgTest();
	    varArgTest(1);
	    varArgTest(3, 5);
	    varArgTest(100, 200, 300);

	}

}
