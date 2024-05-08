package javaTest;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {

		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("sum1의 총합: " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 }); // add() 메소드 호출
		System.out.println("sum2의 총합: " + sum2);
	}

	public static int add(int[] scores) { // 코드라인 15에서 add() 메소드 호출되어 수행, 매개변수 값 [] = { 83, 90, 87 }
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
