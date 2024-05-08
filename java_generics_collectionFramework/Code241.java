package java14;

import java.util.ArrayList;
import java.util.Iterator;

public class Code241 {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<String>(5);
		for(int i = 0; i < 5; i++)
				A.add(i+"");
		
		Iterator<String> it = A.iterator();
		while(it.hasNext())
			System.out.print(it.next());
		
		System.out.println("\n------");
		
		it = A.iterator();
		while(it.hasNext())
			System.out.print(it.next());
	}
}
