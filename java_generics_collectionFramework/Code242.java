package java14;

import java.util.Iterator;
import java.util.TreeSet;

import java.util.TreeSet;

public class Code242 {

	public static void main(String[] args) {
		int A[] = {4, 6, 1, 9, 8, 10, 5, 2, 3, 7};
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < A.length; i++)
				ts.add(A[i]);
		System.out.println(ts); // TreeSet 이름으로 통째로 출력
		
		Iterator<Integer> itr = ts.iterator(); // Iterator로 출력
		while (itr.hasNext()) {
					System.out.print(itr.next() + " ");
		}
	}
}
