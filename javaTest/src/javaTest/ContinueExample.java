package javaTest;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		
		System.out.print("1부터 10까지의 수 중 홀수: ");
		for (int j = 1; j <= 10; j++) { // 1부터 10까지의 수 중 홀수만 추출
			if (j % 2 == 0) { // j % 2 == 0: j가 짝수인지 확인
				continue; // 해당 작업을 건너뛰고 다음 반복 작업을 수행
			}
			System.out.print(j + " ");
		}
		
		System.out.println();
		
		System.out.print("1부터 10까지의 수 중 짝수: ");
		for (int i = 1; i <= 10; i++) { // 1부터 10까지의 수 중 짝수만 추출
			if (i % 2 != 0) { // i % 2 != 0: i가 홀수인지 확인
				continue; // 해당 작업을 건너뛰고 다음 반복 작업을 수행
			}
			System.out.print(i + " ");
		}
	}
}
