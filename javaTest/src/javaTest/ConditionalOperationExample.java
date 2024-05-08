package javaTest;

public class ConditionalOperationExample {
	public static void main(String[] args) {
		
		int score = 85;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		// (score > 90): 조건식, 'A': 피연산자2(true), ((score > 80) ? 'B' : 'C'): 피연산자3(false) 
		// (score > 80): 조건식, 'B': 피연산자2(true), 'C': 피연산자3(false))
		/*
			삼항 연산자(조건 연산식)
			: 조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)
			
			조건식이 'true'를 반환하면 피연산자2를 출력, 'false'면 피연산자3을 출력
			조건식 →(true) 피연산자2/ →(false) 피연산자3
		*/
		
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}
}
