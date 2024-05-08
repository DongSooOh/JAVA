package java14;

import java.util.ArrayList;

public class Code233 {

	public static void main(String[] args) {
		ArrayList<String> number = new ArrayList<String>();
		// ArrayList는 제네릭 자료형, String 타입의 요소를 가진 리스트 생성
		number.add("one");
		number.add("two");
		number.add("three");
		number.add("four");
		
		for (int i = 0; i < number.size(); i++)		
			System.out.println(number.get(i));
	}
}
		/* for (String x : number){
		 	System.out.println(x);
		} for 반복문 대신 for-each로 작성해도 가능
*/	