package javaTest;

public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		// Math.random(): ((0 <= x < 1의 임의의 수) * 6 ) + 1
		// (0 ~ 0.9) * 6 → 0 ~ 5.4
		// (int)(0 ~ 5.4) → 0 ~ 5
		// (0 ~ 5) + 1 → 1 ~ 6(주사위)
		
		if (num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}
	}
}
