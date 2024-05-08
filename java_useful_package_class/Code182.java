package java11;

public class Code182 {

	public static void main(String[] args)
	{
		String str = new String("Java Programming");
		System.out.println("str.charAt(7) : " + str.charAt(7));
		// 명시된 인덱스에 해당하는 문자를 반환,index 7의 문자 : 'O'
		
		String temp = new String("Java Coding");
		System.out.println("str.compareTo(temp) : " + str.compareTo(temp));
		/* 두 문자열을 사전식으로 비교, str("Java Programming")과 "Java Coding" 
		   처음부터 하나 씩 비교 후 다른 문자(여기서는 'P(112)'와 'C(99)')의 아스키 코드 값의 차이 */
		
		String temp2 = new String(" Study");
		System.out.println("str.concat(temp2) : " + str.concat(temp2));
		// 문자열 뒤에 인수를 연결, 'str'에 'temp2'를 연결
		
		String temp3 = new String("gram");
		String temp4 = new String("coding");
		System.out.println("str.contains(temp3) : " + str.contains(temp3));
		System.out.println("str.contains(temp4) : " + str.contains(temp4));
		/* 문자열에 인수가 포함되어 있으면 'true' 반환, 아니면 'false'를 반환
		   str에 각각 temp3, temp4가 포함되어 있는지 판단 */
		
		System.out.println("str.indexOf('a') : " + str.indexOf('a'));
		/* 문자 인수가 있다면 그 위치 인덱스를 반환, 여러 개일 경우 가장 앞에 있는 인덱스 반환
		   'a'의 index를 찾아줌, 'a'가 여러 개이면 가장 먼저 나오는 index를 반환 */ 
		
		System.out.println("str.lastIndexOf('a') : " + str.lastIndexOf('a'));
		// 문자 인수가 있는 가장 마지막 인덱스를 반환
		
		System.out.println("str.indexOf('u') : " + str.indexOf('u'));
		// indexOf는 기본적으로 '-1'을 반환하나 문자가 있으면 그 값을 반환.  즉, 없으면 '-1'반환
		
		System.out.println("str.length() : " + str.length());
		// 문자열의 길이를 반환, 'str'의 길이를 반환
		
		String str2 = str.replace('a', 'A');
		System.out.println("str.replace('a','A') : " + str2);
		// 문자 인수1을 인수2로 변환 후 새로 변환된 문자열을 반환, 'a'를 모두 'A'로 변환
		
 
	}

}
