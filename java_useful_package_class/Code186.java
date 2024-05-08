package java11;

public class Code186 {

	public static void main(String[] args) 
	{
		StringBuffer sb1 = new StringBuffer("Hello world");
		StringBuffer sb2 = new StringBuffer("Hello world");
		
		System.out.println(sb1);
		
		if (sb1.equals(sb2)) System.out.println("sb1 equals sb2");
		else System.out.println("sb1 does not equals sb2");

	}

} /* String 클래스는 toString() 메소드와 equals() 메소드가 오버라이딩되어 있으나
 	 StringBuffer, StringBuilder 클래스는 toString() 메소드만 오버라이딩되어 있음
 	 */
