package javaCollectionFramework;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복이라 값 저장 불가
		set.add("iBATIS");

		int size = set.size(); // 저장되어 있는 전체 객체 수 리턴 
		System.out.println("총 객체 수: " + size); // 중복된 값 제외 4

		// Iterator<> iterator(): 저장된 객체를 한번씩 가져오는 반복자 리턴
		Iterator<String> iterator = set.iterator(); 
		while (iterator.hasNext()) { // hasNext(): 가져올 객체가 있으면 'true' 없으면 'false' 리턴
			String element = iterator.next(); // next(): 컬렉션에서 하나의 객체를 가져옴
			System.out.println("\t" + element);
		}

		set.remove("JDBC"); // remove(): Set 컬렉션에서 객체를 제거
		set.remove("iBATIS");

		System.out.println("총 객체 수: " + set.size());

		for (String element : set) { // set은 오류가 발생할 수 있으니 iterator() 사용 권장
			System.out.println("\t" + element);
		}

		set.clear(); // 저장된 모든 객체 삭제
		if (set.isEmpty()) { // isEmpty(): 컬렉션이 비어있는지 조사
			System.out.println("비어 있음");
		}
	}
}
