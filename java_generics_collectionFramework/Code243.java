package java14;

import java.util.TreeSet;

class Person {
		private int id;
		private int score;
		Person(){}
		Person(int id, int score){
				this.id = id;
				this.score = score;	}
		public String toString() {
			return "[id = " + id + ", score = " + score + "]";
		}
}

public class Code243 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person(3, 83));
		ts.add(new Person(5, 90));
		ts.add(new Person(1, 93));
		ts.add(new Person(2, 88));
		ts.add(new Person(4, 70));
		System.out.println(ts);
	}
}

/* id와 score 값 중 아이디 값이 커야 큰 값인지, 
 * 스코어 값이 커야 큰 값인지 비교가 안 되기 때문에 에러 발생
	이때 Comparable 인터페이스 또는 Comparator를 구현해야 함
*/