package java14;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person5 {
		private String name;
		private int score;
		
		Person5(String name, int score){
				this.name = name;
				this.score = score;
		}
		public String toString() {
				return "(" + name + "," + score + ")";
		}
}

public class Code250 {
	public static void main(String[] args) {
		TreeMap<Integer, Person5> map = new TreeMap<>();
		map.put(3, new Person5("David", 80));
		map.put(1, new Person5("Bob", 90));
		map.put(2, new Person5("Alice", 88));
		map.put(5, new Person5("Cindy", 77));
		map.put(4, new Person5("Jenny", 93));
		
		Set<Integer> keySet = map.keySet(); // key만 뽑아냄
		System.out.println(keySet); // 뽑아낸 키 출력(여기서는 정렬됨)
		System.out.println("---------------------------");
		
		for ( Map.Entry<Integer, Person5> e : map.entrySet() ) {
				Integer key = e.getKey();
				Person5 value = e.getValue();
				System.out.println(key + ":" + value);
		}
		System.out.println("---------------------------");
		Person5 val = (Person5)map.get(3); // map.get(key) 해당 key에 대한 값을 반환
		System.out.print("key 3 → ");
		System.out.println(val);
	}
}
