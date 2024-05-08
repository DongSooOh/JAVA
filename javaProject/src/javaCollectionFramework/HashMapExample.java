package javaCollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {

		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85); // Map은 put()으로 저장
		map.put("홍길동", 90); // 마지막 커서는 해당 키에 있음.(이후 Iterator 호출 시 여기부터 시작)
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일한 키가 있으므로 별도로 객체를 생성하지 않고, 기존 키에 값만 수정
		System.out.println("총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동: " + map.get("홍길동"));
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ": " + value);
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear(); // clear(): 전체 삭제
		System.out.println("총 Entry 수: " + map.size());
	}
}
