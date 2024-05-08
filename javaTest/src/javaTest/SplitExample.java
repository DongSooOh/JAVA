package javaTest;

public class SplitExample {
	public static void main(String[] args) {

		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

		String[] tokens = board.split(","); // board 문자열을 ,로 구분하여 순서대로 tokens 배열에 넣음
		// 문자열.split(): 문자열을 매개변수로 구분하여 순서대로 배열 객체에 넣음.

		// 배열의 인덱스별로 읽기
		System.out.println("번호: " + tokens[0]);
		System.out.println("제목: " + tokens[1]);
		System.out.println("내용: " + tokens[2]);
		System.out.println("성명: " + tokens[3]);
		System.out.println();

		// 위 내용을 for 반복문을 사용하여 읽기
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}
