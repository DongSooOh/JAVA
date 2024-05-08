package java14;

import java.util.Comparator;
import java.util.TreeSet;

class Person2{
		private int id;
		private int score;
		Person2(){}
		Person2(int id, int score){ this.id = id; this.score = score; }
		int getId() { return id; }
		public String toString() { return "[id = " + id + ", score = " + score + "]";}
}

class PersonComparator implements Comparator<Person2>{
	public int compare (Person2 o1, Person2 o2) {
				return o1.getId() - o2.getId();
	}
}

public class Code245 {
	public static void main(String[] args) {
			TreeSet<Person2> ts = new TreeSet<>(new PersonComparator());
			ts.add(new Person2(4, 83));
			ts.add(new Person2(5, 90));
			ts.add(new Person2(2, 93));
			ts.add(new Person2(1, 88));
			ts.add(new Person2(3, 70));
			for(Person2 p : ts)
					System.out.println(p); // for ( 자료형 변수 : 배열 ) { 반복처리할 문장 }
	} 
}
