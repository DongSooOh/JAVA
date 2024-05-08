package java16;

interface Test2<T>{
	boolean test(T n, T m);
}

public class Code268 {
	public static void main(String[] args) {
		Test2<Integer> x = (n, m) -> n < m;
		if (x.test(3, 5))
			System.out.println("3 is less than 5");
		System.out.println();
		
		Test2<String> z = (a, b) -> a.equals(b);
		String str = "java";
		if (z.test(str, "java"))
			System.out.println("same string");
		else
			System.out.println("different string");
	}
}
