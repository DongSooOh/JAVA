package javaProject;

public class Computer {

	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

	int sum2(int... values) { // 가변변수에는 '값'을 받으므로 '주소'를 넘겨주는 참조형은 들어갈 수 없음
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
