package javaCollectionFramework;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		// 0 인덱스부터 Java, JDBC, Database, Servlet/JSP, iBATIS 순으로 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		int size = list.size(); // length()와 동일, 저장된 전체 객체를 확인
		System.out.println("총 객체 수: " + size);
		System.out.println();

		String skill = list.get(2); // 2 인덱스의 객체 리턴
		System.out.println("[2]: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("[" + i + "]: " + str);
		}
		System.out.println();

		list.remove(2); // 2 인덱스의 객체 제거, 뒤 인덱스의 객체들을 한칸씩 앞으로 이동
		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println("[" + i + "]: " + str);
		}
	}
}
