package javaGeneric;

class WithWild<T extends Number> {
	T data;

	WithWild(T d) {
		this.data = d;
	}

	boolean same(WithWild<?> x) {
		// Math.abs(): Àý´ë°ª
		if (Math.abs(data.doubleValue()) == Math.abs(x.data.doubleValue())) {
			return true;
		}
		return false;
	}
}

public class GenericWildCardExample {
	public static void main(String[] args) {

		WithWild<Integer> a = new WithWild<Integer>(6);
		WithWild<Double> b = new WithWild<Double>(-6.0);
		WithWild<Long> c = new WithWild<Long>(5L);

		if (a.same(b)) {
			System.out.println("a and b are equal");
		} else {
			System.out.println("a and b are different");
		}

		if (a.same(c)) {
			System.out.println("a and c are equal");
		} else {
			System.out.println("a and c are different");
		}
	}
}
