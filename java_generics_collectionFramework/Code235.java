package java14;

import java.util.ArrayList;
import java.util.Iterator;

public class Code235 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(1, 55);
		list.add(3, 77);
		
		Iterator<Integer> iter = list.iterator(); // Iterator(반복자)를 얻음
		// list의 객체들을 iter에 넣음, Iterator는 while 혹은 for 루프와 함께 사용
		while (iter.hasNext()) { // 객체 iter의 요소들을 확인, 있으면 true 반환, 없으면 false 반환
			Integer t = iter.next(); // 다음 요소를 반환 및 Iterator의 위치를 다음 요소로 이동, 반환된 요소는 t에 저장
			System.out.println(t); // 저장된 t를 출력
		}
	}
}
