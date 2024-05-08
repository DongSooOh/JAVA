package javaTest;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.14F; x <= 1.0F; x += 0.1F) {
			System.out.println(x);
		}
	}
}
/*
	숫자를 딱 떨어지게 하고 싶으면 int형으로 계산한 후 이후 float이나 double로 변환
*/
