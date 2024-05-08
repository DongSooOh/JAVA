package javaTest;

public class BreakExample {
	public static void main(String[] args) throws Exception {

		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			if (num == 6) {
				break; // 가장 가까운 반복문 빠져나가기(여기서의 while 반복문)
			}
		}
		System.out.println("프로그램 종료");

	}

}
