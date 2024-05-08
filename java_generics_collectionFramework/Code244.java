package java14;

import java.util.Iterator;
import java.util.TreeSet;

class Person1 implements Comparable<Person1> {
		private int id;
		private int score;
		Person1(){}
		Person1(int id, int score){ this.id = id; this.score = score;	}
		public String toString() { return "[id = " + id + ", score = " + score + "]"; }
		public int compareTo(Person1 p) {
			return this.id - p.id; // this.id = this.id - p.id 축약
		}
}

public class Code244 {
	public static void main(String[] args) {
		TreeSet<Person1> ts = new TreeSet<>();
		ts.add(new Person1(3, 83));
		ts.add(new Person1(5, 90));
		ts.add(new Person1(1, 93));
		ts.add(new Person1(2, 88));
		ts.add(new Person1(4, 70));
		
		Iterator<Person1> itr = ts.iterator();
		while (itr.hasNext())
				System.out.println(itr.next());
	}
}