package java11;

public class Code188 {

	public static void main(String[] args) 
	{
		Integer x = new Integer(100);
		int value = x.intValue();
		System.out.println("x : " + x);
		
		String n = "2019";
		int year = Integer.parseInt(n);
		System.out.println("n : " + n);
		
		Integer num1 = Integer.valueOf("2019");
		Integer num2 = Integer.valueOf(2019);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 기본 자료형 또는 문자열로 저장된 기본 자료형 데이터를 인스턴스로
		// 변환하려면 'valueOf' 메소드를 사용

	}

}
 