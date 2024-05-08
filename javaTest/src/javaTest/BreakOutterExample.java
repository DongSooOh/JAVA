package javaTest;

public class BreakOutterExample {
	public static void main(String[] args) throws Exception {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);

				if (lower == 'g') {
					break Outter; // break는 가장 가까운 반복문을 나가나 이름을 지정하면 해당 반복문을 나감
					// 이름(대문자): 반복문, break 이름(대문자); 으로 작성/ 이때 이름은 대문자로 작성
				}
			}
		}
		System.out.println("1번 프로그램 종료");

		int count = 0;

		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				count++;
			}
		}
		System.out.println("총 반복 횟수: " + count);
		System.out.println("2번 프로그램 종료");
	}
}
/*
	for와 while은 조건이 없으면 0회, do while은 1회 반복 for는 반복회수가 정확할 때, while은 반복횟수가 정확하지
	않을 때
 */