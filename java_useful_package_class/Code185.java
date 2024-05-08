package java11;

public class Code185 {
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Good morning");
		sb1.append('!');
		sb1.append(" Alice!");
		System.out.println(sb1);
		// append(인수): 인스턴스(여기서 'sb1')에 인수를 추가
		
		StringBuffer sb2 = new StringBuffer("water");
		StringBuffer sb3 = new StringBuffer("wafer");
		System.out.println("sb2.charAt(2) : " + sb2.charAt(2));
		// charAt(): 인덱스에 위치한 문자를 반환함. (여기서 2번째 인덱스는 't'/ 0-w, 1-a, 2-t로 t가 해당됨)
		System.out.println("sb2.compareTo(sb3) : " + sb2.compareTo(sb3));
		// 동일하다가 두 번째 인덱스에서 각각 't'와 'f'로 다름.(이때 't'와 'f'의 아스키 코드 차이)
		StringBuffer sb4 = new StringBuffer("Java Programming Language");
		sb4.delete(5, 8);
		// A 인덱스부터 B 인덱스 사이의 문자들을 삭제(여기서 'P'부터 'g'사이('g'는 미포함))
		System.out.println("sb4.delete(5,8) : " + sb4); // 'Pro'가 삭제됨
		
		StringBuffer sb5 = new StringBuffer("Hello World");
		sb5.insert(5, ',');
		// A인덱스에 문자 B를 삽입 후 반환
		System.out.println("sb5 : " + sb5); // Hello, ~가 출력됨
		
		System.out.println("sb5.substring(7) : " + sb5.substring(7));
		// ()의 인덱스에서 시작하는 부분 문자열을 반환, 여기서는 7번째가 World
		
		System.out.println("sb5 : " + sb5);
		System.out.println("sb5.capacity() : " + sb5.capacity());
		// 저장공간의 크기로 기존 16에 'Hello World'가 11로 총 27
		sb5.trimToSize();
		// 문자들이 이용하는 크기로 용량을 잘라냄.(실제 문자열이 저장되어 있는 크기)
		System.out.println("after trim : " + sb5.capacity());
		// 'Hello, World!'는 12
	}
} 
