package java14;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Code249 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("david", "qwer123");
		map.put("cindy", "9abcd9");
		map.put("alice", "abc000");
		map.put("paul", "asdf5757");
		map.put("mary", "good!*?");
		Set<String> keySet = map.keySet(); // key만 뽑아냄
		System.out.println(keySet); // 뽑아낸 key 출력
		System.out.println("---------------------------------");
		
		for ( Map.Entry<String, String> e : map.entrySet() ) {
				String key = e.getKey();
				String value = e.getValue();
				System.out.println(key + " : " + value);
		}
			System.out.println("---------------------------------");
			String val = (String)map.get("alice"); // map.get(Key)
			System.out.println("Value for key alice is: " + val); 
	}
}
